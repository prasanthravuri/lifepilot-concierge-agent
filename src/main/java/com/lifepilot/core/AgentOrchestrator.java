package com.lifepilot.core;

import java.util.*;

/**
 * Central orchestrator for multi-agent coordination.
 * Routes user requests to appropriate agents and aggregates responses.
 */
public class AgentOrchestrator {
    private List<Agent> agents = new ArrayList<>();
    private Map<String, Object> sharedContext = new HashMap<>();
    
    public AgentOrchestrator() {}
    
    /**
     * Register an agent with the orchestrator
     */
    public void registerAgent(Agent agent) {
        agents.add(agent);
        agent.initialize();
    }
    
    /**
     * Process user input by routing to appropriate agent
     */
    public String process(String input) {
        for (Agent agent : agents) {
            if (agent.canHandle(input)) {
                return agent.process(input, sharedContext);
            }
        }
        return "Unable to process request. Please try again.";
    }
    
    /**
     * Update shared context
     */
    public void updateContext(String key, Object value) {
        sharedContext.put(key, value);
    }
    
    /**
     * Get shared context value
     */
    public Object getContext(String key) {
        return sharedContext.get(key);
    }
}
