# lifepilot-concierge-agent
Multi-agent Java system for personal life automation using Google's Gemini API. Coordinates meal planning, shopping, travel, and calendar management. Built with ADK-Java and demonstrates multi-agent orchestration, memory management, and observability.


## Overview

LifePilot Concierge Agent is an advanced multi-agent AI system that automates personal life management tasks including meal planning, shopping list management, travel planning, and calendar synchronization. Built using Java with the Google Gemini API, this project demonstrates enterprise-grade agent orchestration, memory management, and observability practices.

## Architecture

The system uses a hierarchical multi-agent architecture:
- **Central Orchestrator**: Routes requests to appropriate agents
- **Specialized Agents**: Each handles a specific domain (meals, shopping, travel, calendar)
- **Shared Memory**: Conversation history and user preferences
- **Tool Layer**: Integrates with external services (Google Calendar, recipe databases)

## Key Concepts Implemented

### 1. Multi-Agent Orchestration
- AgentOrchestrator coordinates 4 independent agents
- Intelligent task routing based on user intent
- Fallback mechanisms for robust operation

### 2. Tool Integration
- GoogleCalendarTool for scheduling
- RecipeDatabaseTool for meal suggestions
- LocationTool for travel planning
- Proper error handling and validation

### 3. Memory Management
- ConversationMemory maintains context across turns
- UserPreferences learns and stores user habits
- Historical decision tracking for consistency

### 4. Agentic Loops
- Each agent follows: Understand -> Plan -> Execute -> Reflect
- Iterative refinement of responses
- Graceful error handling and retry logic

### 5. Observability
- AgentLogger tracks all operations
- PerformanceMonitor records metrics
- Comprehensive execution traces

## Technology Stack

- **Language**: Java 11+
- **AI Engine**: Google Gemini API
- **Build**: Maven
- **Serialization**: Jackson JSON
- **Logging**: SLF4J + Logback

## Project Evaluation

Demonstrates all capstone requirements:

✅ **Multiple Agents**: 4 agents (Meal, Shopping, Travel, Calendar)
✅ **Tool Integration**: 5+ tools with error handling
✅ **Memory Systems**: Conversation + Preference storage
✅ **Agentic Loops**: Full think-act-observe cycles
✅ **Observability**: Logging and metrics
✅ **Real-world Value**: Personal life automation
✅ **Code Quality**: Clean, documented, tested

## Getting Started

```bash
git clone https://github.com/prasanthravuri/lifepilot-concierge-agent.git
cd lifepilot-concierge-agent
mvn clean package
java -cp target/lifepilot-concierge-agent-1.0.jar com.lifepilot.LifePilotApplication
```

## Author

**Ravuri Prasanth**
Email: ravuriprasanth46@gmail.com
GitHub: [@prasanthravuri](https://github.com/prasanthravuri)

## Course

Google 5-Day AI Agents Intensive Capstone Project
