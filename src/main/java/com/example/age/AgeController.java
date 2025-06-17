package com.example.age;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.*;

@Controller
public class AgeController {

    // Serves the main form where users input their date of birth
    @GetMapping("/")
    public String showForm() {
        return "index"; // Load the form view (index.html)
    }

    // Handle form submission and process the age + birthday countdown
    @PostMapping("/calculate")
    public String calculateAge(@RequestParam("dob") String dob, Model model) {
        // Convert string date from form into a LocalDate
        LocalDate birthDate = LocalDate.parse(dob);
        LocalDate today = LocalDate.now();

        // Calculate age in years/months/days
        Period age = Period.between(birthDate, today);

        // Calculate total hours since birth (approximate for display)
        Duration timeSinceBirth = Duration.between(birthDate.atStartOfDay(), LocalDateTime.now());
        long totalHours = timeSinceBirth.toHours();

        int years = age.getYears();
        int days = age.getDays();

        // Calculate time until next birthday
        LocalDate nextBirthday = birthDate.withYear(today.getYear());
        if (!nextBirthday.isAfter(today)) {
            nextBirthday = nextBirthday.plusYears(1);
        }
        Period untilNext = Period.between(today, nextBirthday);

        // Add everything to the model to be used in the Thymeleaf template
        model.addAttribute("years", years);
        model.addAttribute("days", days);
        model.addAttribute("hours", totalHours);
        model.addAttribute("nextMonths", untilNext.getMonths());
        model.addAttribute("nextDays", untilNext.getDays());

        return "index"; // Reload the same page with updated results
    }

    // If someone tries to access /calculate via GET (e.g. typing in the browser), redirect to form
    @GetMapping("/calculate")
    public String redirectToForm() {
        return "redirect:/";
    }
}
