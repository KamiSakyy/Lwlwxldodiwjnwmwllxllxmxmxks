package com.github.service.models.response.type;

import androidx.annotation.Keep;
import d71.a;
import r01.k;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
/* loaded from: /home/user/work/p/classes4.dex */
public final class MobileEventContext {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MobileEventContext[] $VALUES;
    public static final k Companion;
    private final String rawValue;
    public static final MobileEventContext SAVE = new MobileEventContext("SAVE", 0, "SAVE");
    public static final MobileEventContext UNSAVE = new MobileEventContext("UNSAVE", 1, "UNSAVE");
    public static final MobileEventContext DONE = new MobileEventContext("DONE", 2, "DONE");
    public static final MobileEventContext UNDONE = new MobileEventContext("UNDONE", 3, "UNDONE");
    public static final MobileEventContext READ = new MobileEventContext("READ", 4, "READ");
    public static final MobileEventContext UNREAD = new MobileEventContext("UNREAD", 5, "UNREAD");
    public static final MobileEventContext SUBSCRIBE = new MobileEventContext("SUBSCRIBE", 6, "SUBSCRIBE");
    public static final MobileEventContext UNSUBSCRIBE = new MobileEventContext("UNSUBSCRIBE", 7, "UNSUBSCRIBE");
    public static final MobileEventContext CREATED = new MobileEventContext("CREATED", 8, "CREATED");
    public static final MobileEventContext ASSIGNED = new MobileEventContext("ASSIGNED", 9, "ASSIGNED");
    public static final MobileEventContext MENTIONED = new MobileEventContext("MENTIONED", 10, "MENTIONED");
    public static final MobileEventContext REVIEW_REQUESTED = new MobileEventContext("REVIEW_REQUESTED", 11, "REVIEW_REQUESTED");
    public static final MobileEventContext CLOSED = new MobileEventContext("CLOSED", 12, "CLOSED");
    public static final MobileEventContext OPEN = new MobileEventContext("OPEN", 13, "OPEN");
    public static final MobileEventContext DISPLAYED = new MobileEventContext("DISPLAYED", 14, "DISPLAYED");
    public static final MobileEventContext DISMISSED = new MobileEventContext("DISMISSED", 15, "DISMISSED");
    public static final MobileEventContext OPENED = new MobileEventContext("OPENED", 16, "OPENED");
    public static final MobileEventContext AWESOME = new MobileEventContext("AWESOME", 17, "AWESOME");
    public static final MobileEventContext FEED = new MobileEventContext("FEED", 18, "FEED");
    public static final MobileEventContext TRENDING = new MobileEventContext("TRENDING", 19, "TRENDING");
    public static final MobileEventContext CONTINUE_REVIEW = new MobileEventContext("CONTINUE_REVIEW", 20, "CONTINUE_REVIEW");
    public static final MobileEventContext COPILOT_UPSELL_BANNER_FLOW = new MobileEventContext("COPILOT_UPSELL_BANNER_FLOW", 21, "COPILOT_UPSELL_BANNER_FLOW");
    public static final MobileEventContext FOCUSED = new MobileEventContext("FOCUSED", 22, "FOCUSED");
    public static final MobileEventContext NOT_FOCUSED = new MobileEventContext("NOT_FOCUSED", 23, "NOT_FOCUSED");
    public static final MobileEventContext NOTIFICATIONS_ONBOARDING_FLOW = new MobileEventContext("NOTIFICATIONS_ONBOARDING_FLOW", 24, "NOTIFICATIONS_ONBOARDING_FLOW");
    public static final MobileEventContext PAGE_FIVE = new MobileEventContext("PAGE_FIVE", 25, "PAGE_FIVE");
    public static final MobileEventContext PAGE_FOUR = new MobileEventContext("PAGE_FOUR", 26, "PAGE_FOUR");
    public static final MobileEventContext PAGE_ONE = new MobileEventContext("PAGE_ONE", 27, "PAGE_ONE");
    public static final MobileEventContext PAGE_SEVEN = new MobileEventContext("PAGE_SEVEN", 28, "PAGE_SEVEN");
    public static final MobileEventContext PAGE_SIX = new MobileEventContext("PAGE_SIX", 29, "PAGE_SIX");
    public static final MobileEventContext PAGE_THREE = new MobileEventContext("PAGE_THREE", 30, "PAGE_THREE");
    public static final MobileEventContext PAGE_TWO = new MobileEventContext("PAGE_TWO", 31, "PAGE_TWO");
    public static final MobileEventContext COMPLETE = new MobileEventContext("COMPLETE", 32, "COMPLETE");
    public static final MobileEventContext AGENT_PULL_REQUESTS = new MobileEventContext("AGENT_PULL_REQUESTS", 33, "AGENT_PULL_REQUESTS");
    public static final MobileEventContext AGENT_TASKS_HOME = new MobileEventContext("AGENT_TASKS_HOME", 34, "AGENT_TASKS_HOME");
    public static final MobileEventContext AGENT_TASKS_REPOSITORY = new MobileEventContext("AGENT_TASKS_REPOSITORY", 35, "AGENT_TASKS_REPOSITORY");
    public static final MobileEventContext HOME = new MobileEventContext("HOME", 36, "HOME");
    public static final MobileEventContext REPOSITORY = new MobileEventContext("REPOSITORY", 37, "REPOSITORY");
    public static final MobileEventContext COPILOT_CHAT = new MobileEventContext("COPILOT_CHAT", 38, "COPILOT_CHAT");
    public static final MobileEventContext COPILOT_CHAT_ASSISTANT_MESSAGE = new MobileEventContext("COPILOT_CHAT_ASSISTANT_MESSAGE", 39, "COPILOT_CHAT_ASSISTANT_MESSAGE");
    public static final MobileEventContext COPILOT_CHAT_INPUT_FIELD = new MobileEventContext("COPILOT_CHAT_INPUT_FIELD", 40, "COPILOT_CHAT_INPUT_FIELD");
    public static final MobileEventContext EXTERNAL = new MobileEventContext("EXTERNAL", 41, "EXTERNAL");
    public static final MobileEventContext COMMIT_DETAILS = new MobileEventContext("COMMIT_DETAILS", 42, "COMMIT_DETAILS");
    public static final MobileEventContext ISSUE_DETAILS = new MobileEventContext("ISSUE_DETAILS", 43, "ISSUE_DETAILS");
    public static final MobileEventContext PULL_REQUEST_DETAILS = new MobileEventContext("PULL_REQUEST_DETAILS", 44, "PULL_REQUEST_DETAILS");
    public static final MobileEventContext PULL_REQUEST_FILES = new MobileEventContext("PULL_REQUEST_FILES", 45, "PULL_REQUEST_FILES");
    public static final MobileEventContext PULL_REQUEST_FILES_CHANGED = new MobileEventContext("PULL_REQUEST_FILES_CHANGED", 46, "PULL_REQUEST_FILES_CHANGED");
    public static final MobileEventContext REPOSITORY_FILE_VIEWER = new MobileEventContext("REPOSITORY_FILE_VIEWER", 47, "REPOSITORY_FILE_VIEWER");
    public static final MobileEventContext WORKFLOW_RUNS = new MobileEventContext("WORKFLOW_RUNS", 48, "WORKFLOW_RUNS");
    public static final MobileEventContext WORKFLOW_RUN_STEPS = new MobileEventContext("WORKFLOW_RUN_STEPS", 49, "WORKFLOW_RUN_STEPS");
    public static final MobileEventContext WORKFLOW_RUN_STEP_LOG = new MobileEventContext("WORKFLOW_RUN_STEP_LOG", 50, "WORKFLOW_RUN_STEP_LOG");
    public static final MobileEventContext WORKFLOW_SUMMARY = new MobileEventContext("WORKFLOW_SUMMARY", 51, "WORKFLOW_SUMMARY");
    public static final MobileEventContext PULL_REQUEST_FILES_CHANGED_SINGLE_FILE = new MobileEventContext("PULL_REQUEST_FILES_CHANGED_SINGLE_FILE", 52, "PULL_REQUEST_FILES_CHANGED_SINGLE_FILE");
    public static final MobileEventContext AGENT_INSTRUCTIONS_EMPTY = new MobileEventContext("AGENT_INSTRUCTIONS_EMPTY", 53, "AGENT_INSTRUCTIONS_EMPTY");
    public static final MobileEventContext AGENT_INSTRUCTIONS_INCLUDED = new MobileEventContext("AGENT_INSTRUCTIONS_INCLUDED", 54, "AGENT_INSTRUCTIONS_INCLUDED");
    public static final MobileEventContext COPILOT_HOME = new MobileEventContext("COPILOT_HOME", 55, "COPILOT_HOME");
    public static final MobileEventContext COPILOT_THREADS = new MobileEventContext("COPILOT_THREADS", 56, "COPILOT_THREADS");
    public static final MobileEventContext ISSUE_CELL = new MobileEventContext("ISSUE_CELL", 57, "ISSUE_CELL");
    public static final MobileEventContext NEW_ISSUE = new MobileEventContext("NEW_ISSUE", 58, "NEW_ISSUE");
    public static final MobileEventContext AGENT_LOGS = new MobileEventContext("AGENT_LOGS", 59, "AGENT_LOGS");
    public static final MobileEventContext AGENT_TASK_ACTIVE = new MobileEventContext("AGENT_TASK_ACTIVE", 60, "AGENT_TASK_ACTIVE");
    public static final MobileEventContext AGENT_TASK_COMPLETED = new MobileEventContext("AGENT_TASK_COMPLETED", 61, "AGENT_TASK_COMPLETED");
    public static final MobileEventContext CREATE_REPO_CONFIGURATION = new MobileEventContext("CREATE_REPO_CONFIGURATION", 62, "CREATE_REPO_CONFIGURATION");
    public static final MobileEventContext CREATE_REPO_GENERAL = new MobileEventContext("CREATE_REPO_GENERAL", 63, "CREATE_REPO_GENERAL");
    public static final MobileEventContext PROFILE_REPOSITORIES = new MobileEventContext("PROFILE_REPOSITORIES", 64, "PROFILE_REPOSITORIES");
    public static final MobileEventContext UNKNOWN__ = new MobileEventContext("UNKNOWN__", 65, "UNKNOWN__");

    private static final /* synthetic */ MobileEventContext[] $values() {
        return new MobileEventContext[]{SAVE, UNSAVE, DONE, UNDONE, READ, UNREAD, SUBSCRIBE, UNSUBSCRIBE, CREATED, ASSIGNED, MENTIONED, REVIEW_REQUESTED, CLOSED, OPEN, DISPLAYED, DISMISSED, OPENED, AWESOME, FEED, TRENDING, CONTINUE_REVIEW, COPILOT_UPSELL_BANNER_FLOW, FOCUSED, NOT_FOCUSED, NOTIFICATIONS_ONBOARDING_FLOW, PAGE_FIVE, PAGE_FOUR, PAGE_ONE, PAGE_SEVEN, PAGE_SIX, PAGE_THREE, PAGE_TWO, COMPLETE, AGENT_PULL_REQUESTS, AGENT_TASKS_HOME, AGENT_TASKS_REPOSITORY, HOME, REPOSITORY, COPILOT_CHAT, COPILOT_CHAT_ASSISTANT_MESSAGE, COPILOT_CHAT_INPUT_FIELD, EXTERNAL, COMMIT_DETAILS, ISSUE_DETAILS, PULL_REQUEST_DETAILS, PULL_REQUEST_FILES, PULL_REQUEST_FILES_CHANGED, REPOSITORY_FILE_VIEWER, WORKFLOW_RUNS, WORKFLOW_RUN_STEPS, WORKFLOW_RUN_STEP_LOG, WORKFLOW_SUMMARY, PULL_REQUEST_FILES_CHANGED_SINGLE_FILE, AGENT_INSTRUCTIONS_EMPTY, AGENT_INSTRUCTIONS_INCLUDED, COPILOT_HOME, COPILOT_THREADS, ISSUE_CELL, NEW_ISSUE, AGENT_LOGS, AGENT_TASK_ACTIVE, AGENT_TASK_COMPLETED, CREATE_REPO_CONFIGURATION, CREATE_REPO_GENERAL, PROFILE_REPOSITORIES, UNKNOWN__};
    }

    static {
        MobileEventContext[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
        Companion = new k();
    }

    private MobileEventContext(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static MobileEventContext valueOf(String str) {
        return (MobileEventContext) Enum.valueOf(MobileEventContext.class, str);
    }

    public static MobileEventContext[] values() {
        return (MobileEventContext[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    public static  ordinal(Object... a) {
        return null;
    }
}
