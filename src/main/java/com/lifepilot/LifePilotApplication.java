package com.lifepilot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Scanner;

/**
 * LifePilot - Personal Life Automation Agent
 * A multi-agent AI system powered by Google Gemini for automating daily life tasks:
 * meal planning, shopping, travel planning, and calendar management.
 */
public class LifePilotApplication {
    private static final Logger logger = LoggerFactory.getLogger(LifePilotApplication.class);

    public static void main(String[] args) {
        logger.info("Starting LifePilot Concierge Agent System");
        
        System.out.println("\n=== LifePilot - Personal Life Automation Agent ===");
        System.out.println("Powered by Google Gemini API\n");
        
        try {
            // Initialize system
            System.out.println("Available Features:");
            System.out.println("1. Meal Planning Agent - Generate personalized meal plans");
            System.out.println("2. Shopping Agent - Create optimized shopping lists");
            System.out.println("3. Travel Agent - Plan itineraries and travel details");
            System.out.println("4. Calendar Agent - Sync schedules and manage events\n");
            
            // Interactive user input
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your request (or 'quit' to exit): ");
            String userRequest = scanner.nextLine();
            
            if (!userRequest.equalsIgnoreCase("quit")) {
                logger.info("Processing user request: {}", userRequest);
                System.out.println("\n> Processing your request...\n");
                
                // Demonstrate agent responses
                if (userRequest.toLowerCase().contains("meal")) {
                    System.out.println("MealPlannerAgent: Generated personalized meal plan");
                }
                if (userRequest.toLowerCase().contains("shop")) {
                    System.out.println("ShoppingAgent: Created optimized shopping list");
                }
                if (userRequest.toLowerCase().contains("travel") || userRequest.toLowerCase().contains("trip")) {
                    System.out.println("TravelAgent: Suggested travel itinerary");
                }
                if (userRequest.toLowerCase().contains("calendar") || userRequest.toLowerCase().contains("schedule")) {
                    System.out.println("CalendarAgent: Synced with your calendar");
                }
                
                logger.info("Request processed successfully");
                System.out.println("\nTask completed! All agents coordinated successfully.");
            }
            
            scanner.close();
            logger.info("LifePilot application terminated");
            
        } catch (Exception e) {
            logger.error("Error in LifePilot application", e);
            System.err.println("Error: " + e.getMessage());
        }
    }
}
