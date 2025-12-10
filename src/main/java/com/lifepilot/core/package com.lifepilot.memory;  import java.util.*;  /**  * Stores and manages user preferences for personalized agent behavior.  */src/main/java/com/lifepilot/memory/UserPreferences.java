package com.lifepilot.memory;

import java.util.*;

/**
 * Stores and manages user preferences for personalized agent behavior.
 */
public class UserPreferences {
    private Map<String, String> preferences = new HashMap<>();
    private Set<String> allergies = new HashSet<>();
    private List<String> favoriteRecipes = new ArrayList<>();
    private String userId;
    
    public UserPreferences(String userId) {
        this.userId = userId;
        initializeDefaults();
    }
    
    private void initializeDefaults() {
        preferences.put("cuisine", "varied");
        preferences.put("budget", "moderate");
        preferences.put("mealType", "balanced");
    }
    
    public void setPreference(String key, String value) {
        preferences.put(key, value);
    }
    
    public String getPreference(String key) {
        return preferences.getOrDefault(key, "not set");
    }
    
    public void addAllergy(String allergy) {
        allergies.add(allergy);
    }
    
    public boolean hasAllergy(String item) {
        return allergies.stream().anyMatch(item::contains);
    }
    
    public void addFavoriteRecipe(String recipe) {
        if (!favoriteRecipes.contains(recipe)) {
            favoriteRecipes.add(recipe);
        }
    }
    
    public List<String> getFavoriteRecipes() {
        return new ArrayList<>(favoriteRecipes);
    }
}
