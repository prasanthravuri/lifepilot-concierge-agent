package com.lifepilot.core;

import java.util.Map;

/**
 * Base interface for all agents in the LifePilot system.
 * Each agent handles a specific domain of personal life automation.
 */
public interface Agent {
    /**
     * Process user input and generate response
     * @param input User query or command
     * @param context Current conversation context
     * @return Agent response
     */
    String process(String input, Map<String, Object> context);
    
    /**
     * Get the domain this agent specializes in
     * @return Domain name
     */
    String getDomain();
    
    /**
     * Check if this agent can handle the given request
     * @param input User query
     * @return true if this agent can handle it
     */
    boolean canHandle(String input);
    
    /**
     * Initialize the agent with necessary configuration
     */
    void initialize();
}
