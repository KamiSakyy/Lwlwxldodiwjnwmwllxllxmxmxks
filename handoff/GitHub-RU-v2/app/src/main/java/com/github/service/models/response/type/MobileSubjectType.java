package com.github.service.models.response.type;

import androidx.annotation.Keep;
import d71.a;
import r01.l;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
/* loaded from: /home/user/work/p/classes4.dex */
public final class MobileSubjectType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MobileSubjectType[] $VALUES;
    public static final l Companion;
    private final String rawValue;
    public static final MobileSubjectType CHECK_SUITE = new MobileSubjectType("CHECK_SUITE", 0, "CHECK_SUITE");
    public static final MobileSubjectType COMMIT = new MobileSubjectType("COMMIT", 1, "COMMIT");
    public static final MobileSubjectType COMMITS = new MobileSubjectType("COMMITS", 2, "COMMITS");
    public static final MobileSubjectType COPILOT_PAYWALL = new MobileSubjectType("COPILOT_PAYWALL", 3, "COPILOT_PAYWALL");
    public static final MobileSubjectType COPILOT_SETTINGS = new MobileSubjectType("COPILOT_SETTINGS", 4, "COPILOT_SETTINGS");
    public static final MobileSubjectType COPILOT_UPSELL = new MobileSubjectType("COPILOT_UPSELL", 5, "COPILOT_UPSELL");
    public static final MobileSubjectType DEPLOYMENT_REVIEW = new MobileSubjectType("DEPLOYMENT_REVIEW", 6, "DEPLOYMENT_REVIEW");
    public static final MobileSubjectType DIFF = new MobileSubjectType("DIFF", 7, "DIFF");
    public static final MobileSubjectType DISCUSSION = new MobileSubjectType("DISCUSSION", 8, "DISCUSSION");
    public static final MobileSubjectType DISCUSSIONS = new MobileSubjectType("DISCUSSIONS", 9, "DISCUSSIONS");
    public static final MobileSubjectType DRAFT_ISSUE = new MobileSubjectType("DRAFT_ISSUE", 10, "DRAFT_ISSUE");
    public static final MobileSubjectType FEED = new MobileSubjectType("FEED", 11, "FEED");
    public static final MobileSubjectType FILE = new MobileSubjectType("FILE", 12, "FILE");
    public static final MobileSubjectType FILTER_AUTHOR = new MobileSubjectType("FILTER_AUTHOR", 13, "FILTER_AUTHOR");
    public static final MobileSubjectType FILTER_ASSIGNEE = new MobileSubjectType("FILTER_ASSIGNEE", 14, "FILTER_ASSIGNEE");
    public static final MobileSubjectType FILTER_DISCUSSION_CATEGORY = new MobileSubjectType("FILTER_DISCUSSION_CATEGORY", 15, "FILTER_DISCUSSION_CATEGORY");
    public static final MobileSubjectType FILTER_DISCUSSION_IS_UNANSWERED = new MobileSubjectType("FILTER_DISCUSSION_IS_UNANSWERED", 16, "FILTER_DISCUSSION_IS_UNANSWERED");
    public static final MobileSubjectType FILTER_DISCUSSION_TOP = new MobileSubjectType("FILTER_DISCUSSION_TOP", 17, "FILTER_DISCUSSION_TOP");
    public static final MobileSubjectType FILTER_DISCUSSION_VIEWER = new MobileSubjectType("FILTER_DISCUSSION_VIEWER", 18, "FILTER_DISCUSSION_VIEWER");
    public static final MobileSubjectType FILTER_ISSUE_STATUS = new MobileSubjectType("FILTER_ISSUE_STATUS", 19, "FILTER_ISSUE_STATUS");
    public static final MobileSubjectType FILTER_ISSUE_TYPE = new MobileSubjectType("FILTER_ISSUE_TYPE", 20, "FILTER_ISSUE_TYPE");
    public static final MobileSubjectType FILTER_ISSUE_VIEWER = new MobileSubjectType("FILTER_ISSUE_VIEWER", 21, "FILTER_ISSUE_VIEWER");
    public static final MobileSubjectType FILTER_LABEL = new MobileSubjectType("FILTER_LABEL", 22, "FILTER_LABEL");
    public static final MobileSubjectType FILTER_MILESTONE = new MobileSubjectType("FILTER_MILESTONE", 23, "FILTER_MILESTONE");
    public static final MobileSubjectType FILTER_NOTIFICATION_IS_UNREAD = new MobileSubjectType("FILTER_NOTIFICATION_IS_UNREAD", 24, "FILTER_NOTIFICATION_IS_UNREAD");
    public static final MobileSubjectType FILTER_NOTIFICATION_STATUS = new MobileSubjectType("FILTER_NOTIFICATION_STATUS", 25, "FILTER_NOTIFICATION_STATUS");
    public static final MobileSubjectType FILTER_NOTIFICATION_FILTER = new MobileSubjectType("FILTER_NOTIFICATION_FILTER", 26, "FILTER_NOTIFICATION_FILTER");
    public static final MobileSubjectType FILTER_NOTIFICATION_FOCUSED = new MobileSubjectType("FILTER_NOTIFICATION_FOCUSED", 27, "FILTER_NOTIFICATION_FOCUSED");
    public static final MobileSubjectType FILTER_ORGANIZATION = new MobileSubjectType("FILTER_ORGANIZATION", 28, "FILTER_ORGANIZATION");
    public static final MobileSubjectType FILTER_PROJECT = new MobileSubjectType("FILTER_PROJECT", 29, "FILTER_PROJECT");
    public static final MobileSubjectType FILTER_PULL_REQUEST_REVIEW_STATUS = new MobileSubjectType("FILTER_PULL_REQUEST_REVIEW_STATUS", 30, "FILTER_PULL_REQUEST_REVIEW_STATUS");
    public static final MobileSubjectType FILTER_PULL_REQUEST_STATUS = new MobileSubjectType("FILTER_PULL_REQUEST_STATUS", 31, "FILTER_PULL_REQUEST_STATUS");
    public static final MobileSubjectType FILTER_PULL_REQUEST_VIEWER = new MobileSubjectType("FILTER_PULL_REQUEST_VIEWER", 32, "FILTER_PULL_REQUEST_VIEWER");
    public static final MobileSubjectType FILTER_REPOSITORY = new MobileSubjectType("FILTER_REPOSITORY", 33, "FILTER_REPOSITORY");
    public static final MobileSubjectType FILTER_REPOSITORY_VISIBILITY = new MobileSubjectType("FILTER_REPOSITORY_VISIBILITY", 34, "FILTER_REPOSITORY_VISIBILITY");
    public static final MobileSubjectType FILTER_SORT = new MobileSubjectType("FILTER_SORT", 35, "FILTER_SORT");
    public static final MobileSubjectType FILTER_TRENDING_DATE_RANGE = new MobileSubjectType("FILTER_TRENDING_DATE_RANGE", 36, "FILTER_TRENDING_DATE_RANGE");
    public static final MobileSubjectType FILTER_TRENDING_LANGUAGE = new MobileSubjectType("FILTER_TRENDING_LANGUAGE", 37, "FILTER_TRENDING_LANGUAGE");
    public static final MobileSubjectType FILTER_TRENDING_SPOKEN_LANGUAGE = new MobileSubjectType("FILTER_TRENDING_SPOKEN_LANGUAGE", 38, "FILTER_TRENDING_SPOKEN_LANGUAGE");
    public static final MobileSubjectType GIST = new MobileSubjectType("GIST", 39, "GIST");
    public static final MobileSubjectType HOME = new MobileSubjectType("HOME", 40, "HOME");
    public static final MobileSubjectType ISSUE = new MobileSubjectType("ISSUE", 41, "ISSUE");
    public static final MobileSubjectType ISSUES = new MobileSubjectType("ISSUES", 42, "ISSUES");
    public static final MobileSubjectType ORGANIZATION = new MobileSubjectType("ORGANIZATION", 43, "ORGANIZATION");
    public static final MobileSubjectType NOTIFICATIONS = new MobileSubjectType("NOTIFICATIONS", 44, "NOTIFICATIONS");
    public static final MobileSubjectType PROJECT = new MobileSubjectType("PROJECT", 45, "PROJECT");
    public static final MobileSubjectType PROJECTS = new MobileSubjectType("PROJECTS", 46, "PROJECTS");
    public static final MobileSubjectType PULL_REQUEST = new MobileSubjectType("PULL_REQUEST", 47, "PULL_REQUEST");
    public static final MobileSubjectType PULL_REQUESTS = new MobileSubjectType("PULL_REQUESTS", 48, "PULL_REQUESTS");
    public static final MobileSubjectType PUSH_NOTIFICATIONS = new MobileSubjectType("PUSH_NOTIFICATIONS", 49, "PUSH_NOTIFICATIONS");
    public static final MobileSubjectType PUSH_NOTIFICATION_MENTION = new MobileSubjectType("PUSH_NOTIFICATION_MENTION", 50, "PUSH_NOTIFICATION_MENTION");
    public static final MobileSubjectType PUSH_NOTIFICATION_PULL_REQUEST_REVIEW = new MobileSubjectType("PUSH_NOTIFICATION_PULL_REQUEST_REVIEW", 51, "PUSH_NOTIFICATION_PULL_REQUEST_REVIEW");
    public static final MobileSubjectType PUSH_NOTIFICATION_REVIEW_REQUEST = new MobileSubjectType("PUSH_NOTIFICATION_REVIEW_REQUEST", 52, "PUSH_NOTIFICATION_REVIEW_REQUEST");
    public static final MobileSubjectType PUSH_NOTIFICATION_ASSIGN = new MobileSubjectType("PUSH_NOTIFICATION_ASSIGN", 53, "PUSH_NOTIFICATION_ASSIGN");
    public static final MobileSubjectType PUSH_NOTIFICATION_DEPLOYMENT_APPROVAL = new MobileSubjectType("PUSH_NOTIFICATION_DEPLOYMENT_APPROVAL", 54, "PUSH_NOTIFICATION_DEPLOYMENT_APPROVAL");
    public static final MobileSubjectType PUSH_NOTIFICATION_MOBILE_AUTH_REQUEST = new MobileSubjectType("PUSH_NOTIFICATION_MOBILE_AUTH_REQUEST", 55, "PUSH_NOTIFICATION_MOBILE_AUTH_REQUEST");
    public static final MobileSubjectType PUSH_NOTIFICATION_RELEASE = new MobileSubjectType("PUSH_NOTIFICATION_RELEASE", 56, "PUSH_NOTIFICATION_RELEASE");
    public static final MobileSubjectType PUSH_NOTIFICATION_DISABLE_LIVE_UPDATES = new MobileSubjectType("PUSH_NOTIFICATION_DISABLE_LIVE_UPDATES", 57, "PUSH_NOTIFICATION_DISABLE_LIVE_UPDATES");
    public static final MobileSubjectType PUSH_NOTIFICATION_LIVE_UPDATE_AGENTS = new MobileSubjectType("PUSH_NOTIFICATION_LIVE_UPDATE_AGENTS", 58, "PUSH_NOTIFICATION_LIVE_UPDATE_AGENTS");
    public static final MobileSubjectType RELEASE = new MobileSubjectType("RELEASE", 59, "RELEASE");
    public static final MobileSubjectType RELEASES = new MobileSubjectType("RELEASES", 60, "RELEASES");
    public static final MobileSubjectType REPOSITORIES = new MobileSubjectType("REPOSITORIES", 61, "REPOSITORIES");
    public static final MobileSubjectType REPOSITORY = new MobileSubjectType("REPOSITORY", 62, "REPOSITORY");
    public static final MobileSubjectType REPOSITORY_ADVISORY = new MobileSubjectType("REPOSITORY_ADVISORY", 63, "REPOSITORY_ADVISORY");
    public static final MobileSubjectType REPOSITORY_DEPENDABOT_THREAD_ALERT = new MobileSubjectType("REPOSITORY_DEPENDABOT_THREAD_ALERT", 64, "REPOSITORY_DEPENDABOT_THREAD_ALERT");
    public static final MobileSubjectType REPOSITORY_VULNERABILITY_ALERT = new MobileSubjectType("REPOSITORY_VULNERABILITY_ALERT", 65, "REPOSITORY_VULNERABILITY_ALERT");
    public static final MobileSubjectType SECURITY_ADVISORY = new MobileSubjectType("SECURITY_ADVISORY", 66, "SECURITY_ADVISORY");
    public static final MobileSubjectType SHORTCUT = new MobileSubjectType("SHORTCUT", 67, "SHORTCUT");
    public static final MobileSubjectType SWIPE_ACTIONS = new MobileSubjectType("SWIPE_ACTIONS", 68, "SWIPE_ACTIONS");
    public static final MobileSubjectType TEAM_DISCUSSION = new MobileSubjectType("TEAM_DISCUSSION", 69, "TEAM_DISCUSSION");
    public static final MobileSubjectType WORKFLOW_RUN = new MobileSubjectType("WORKFLOW_RUN", 70, "WORKFLOW_RUN");
    public static final MobileSubjectType USER = new MobileSubjectType("USER", 71, "USER");
    public static final MobileSubjectType USERS = new MobileSubjectType("USERS", 72, "USERS");
    public static final MobileSubjectType FILTER_REPOSITORY_TYPE = new MobileSubjectType("FILTER_REPOSITORY_TYPE", 73, "FILTER_REPOSITORY_TYPE");
    public static final MobileSubjectType FILTER_LANGUAGE = new MobileSubjectType("FILTER_LANGUAGE", 74, "FILTER_LANGUAGE");
    public static final MobileSubjectType PUSH_NOTIFICATION_ACTION = new MobileSubjectType("PUSH_NOTIFICATION_ACTION", 75, "PUSH_NOTIFICATION_ACTION");
    public static final MobileSubjectType FILTER_DISCUSSION_STATUS = new MobileSubjectType("FILTER_DISCUSSION_STATUS", 76, "FILTER_DISCUSSION_STATUS");
    public static final MobileSubjectType TOAST = new MobileSubjectType("TOAST", 77, "TOAST");
    public static final MobileSubjectType SETTINGS = new MobileSubjectType("SETTINGS", 78, "SETTINGS");
    public static final MobileSubjectType NAVIGATION_BAR = new MobileSubjectType("NAVIGATION_BAR", 79, "NAVIGATION_BAR");
    public static final MobileSubjectType DEEP_LINK = new MobileSubjectType("DEEP_LINK", 80, "DEEP_LINK");
    public static final MobileSubjectType CODE = new MobileSubjectType("CODE", 81, "CODE");
    public static final MobileSubjectType GLOBAL_SEARCH = new MobileSubjectType("GLOBAL_SEARCH", 82, "GLOBAL_SEARCH");
    public static final MobileSubjectType JUMP_TO = new MobileSubjectType("JUMP_TO", 83, "JUMP_TO");
    public static final MobileSubjectType ORGANIZATIONS = new MobileSubjectType("ORGANIZATIONS", 84, "ORGANIZATIONS");
    public static final MobileSubjectType SUBMIT_REVIEW_SHEET = new MobileSubjectType("SUBMIT_REVIEW_SHEET", 85, "SUBMIT_REVIEW_SHEET");
    public static final MobileSubjectType BRANCHES = new MobileSubjectType("BRANCHES", 86, "BRANCHES");
    public static final MobileSubjectType SUB_ISSUE = new MobileSubjectType("SUB_ISSUE", 87, "SUB_ISSUE");
    public static final MobileSubjectType AGENT_TASK = new MobileSubjectType("AGENT_TASK", 88, "AGENT_TASK");
    public static final MobileSubjectType CUSTOM_AGENT = new MobileSubjectType("CUSTOM_AGENT", 89, "CUSTOM_AGENT");
    public static final MobileSubjectType EMPTY_STATE = new MobileSubjectType("EMPTY_STATE", 90, "EMPTY_STATE");
    public static final MobileSubjectType EMPTY_STATE_CTA = new MobileSubjectType("EMPTY_STATE_CTA", 91, "EMPTY_STATE_CTA");
    public static final MobileSubjectType FILTER = new MobileSubjectType("FILTER", 92, "FILTER");
    public static final MobileSubjectType SEARCH = new MobileSubjectType("SEARCH", 93, "SEARCH");
    public static final MobileSubjectType SEND_AGENT_TASK = new MobileSubjectType("SEND_AGENT_TASK", 94, "SEND_AGENT_TASK");
    public static final MobileSubjectType FILTER_DRAFT = new MobileSubjectType("FILTER_DRAFT", 95, "FILTER_DRAFT");
    public static final MobileSubjectType FILTER_VIEWER_REVIEW_REQUESTED = new MobileSubjectType("FILTER_VIEWER_REVIEW_REQUESTED", 96, "FILTER_VIEWER_REVIEW_REQUESTED");
    public static final MobileSubjectType AGENT_ASSIGNMENT = new MobileSubjectType("AGENT_ASSIGNMENT", 97, "AGENT_ASSIGNMENT");
    public static final MobileSubjectType FILTER_AGENT_TASK_STATE = new MobileSubjectType("FILTER_AGENT_TASK_STATE", 98, "FILTER_AGENT_TASK_STATE");
    public static final MobileSubjectType FILTER_AGENT_TASKS_SORT = new MobileSubjectType("FILTER_AGENT_TASKS_SORT", 99, "FILTER_AGENT_TASKS_SORT");
    public static final MobileSubjectType AGENT_TASK_CCA = new MobileSubjectType("AGENT_TASK_CCA", 100, "AGENT_TASK_CCA");
    public static final MobileSubjectType AGENT_TASK_CLI = new MobileSubjectType("AGENT_TASK_CLI", 101, "AGENT_TASK_CLI");
    public static final MobileSubjectType AGENT_TASK_CLI_REPOLESS = new MobileSubjectType("AGENT_TASK_CLI_REPOLESS", 102, "AGENT_TASK_CLI_REPOLESS");
    public static final MobileSubjectType AGENT_TASK_VSCODE = new MobileSubjectType("AGENT_TASK_VSCODE", 103, "AGENT_TASK_VSCODE");
    public static final MobileSubjectType REPOSITORY_CREATION = new MobileSubjectType("REPOSITORY_CREATION", 104, "REPOSITORY_CREATION");
    public static final MobileSubjectType UNKNOWN__ = new MobileSubjectType("UNKNOWN__", 105, "UNKNOWN__");

    private static final /* synthetic */ MobileSubjectType[] $values() {
        return new MobileSubjectType[]{CHECK_SUITE, COMMIT, COMMITS, COPILOT_PAYWALL, COPILOT_SETTINGS, COPILOT_UPSELL, DEPLOYMENT_REVIEW, DIFF, DISCUSSION, DISCUSSIONS, DRAFT_ISSUE, FEED, FILE, FILTER_AUTHOR, FILTER_ASSIGNEE, FILTER_DISCUSSION_CATEGORY, FILTER_DISCUSSION_IS_UNANSWERED, FILTER_DISCUSSION_TOP, FILTER_DISCUSSION_VIEWER, FILTER_ISSUE_STATUS, FILTER_ISSUE_TYPE, FILTER_ISSUE_VIEWER, FILTER_LABEL, FILTER_MILESTONE, FILTER_NOTIFICATION_IS_UNREAD, FILTER_NOTIFICATION_STATUS, FILTER_NOTIFICATION_FILTER, FILTER_NOTIFICATION_FOCUSED, FILTER_ORGANIZATION, FILTER_PROJECT, FILTER_PULL_REQUEST_REVIEW_STATUS, FILTER_PULL_REQUEST_STATUS, FILTER_PULL_REQUEST_VIEWER, FILTER_REPOSITORY, FILTER_REPOSITORY_VISIBILITY, FILTER_SORT, FILTER_TRENDING_DATE_RANGE, FILTER_TRENDING_LANGUAGE, FILTER_TRENDING_SPOKEN_LANGUAGE, GIST, HOME, ISSUE, ISSUES, ORGANIZATION, NOTIFICATIONS, PROJECT, PROJECTS, PULL_REQUEST, PULL_REQUESTS, PUSH_NOTIFICATIONS, PUSH_NOTIFICATION_MENTION, PUSH_NOTIFICATION_PULL_REQUEST_REVIEW, PUSH_NOTIFICATION_REVIEW_REQUEST, PUSH_NOTIFICATION_ASSIGN, PUSH_NOTIFICATION_DEPLOYMENT_APPROVAL, PUSH_NOTIFICATION_MOBILE_AUTH_REQUEST, PUSH_NOTIFICATION_RELEASE, PUSH_NOTIFICATION_DISABLE_LIVE_UPDATES, PUSH_NOTIFICATION_LIVE_UPDATE_AGENTS, RELEASE, RELEASES, REPOSITORIES, REPOSITORY, REPOSITORY_ADVISORY, REPOSITORY_DEPENDABOT_THREAD_ALERT, REPOSITORY_VULNERABILITY_ALERT, SECURITY_ADVISORY, SHORTCUT, SWIPE_ACTIONS, TEAM_DISCUSSION, WORKFLOW_RUN, USER, USERS, FILTER_REPOSITORY_TYPE, FILTER_LANGUAGE, PUSH_NOTIFICATION_ACTION, FILTER_DISCUSSION_STATUS, TOAST, SETTINGS, NAVIGATION_BAR, DEEP_LINK, CODE, GLOBAL_SEARCH, JUMP_TO, ORGANIZATIONS, SUBMIT_REVIEW_SHEET, BRANCHES, SUB_ISSUE, AGENT_TASK, CUSTOM_AGENT, EMPTY_STATE, EMPTY_STATE_CTA, FILTER, SEARCH, SEND_AGENT_TASK, FILTER_DRAFT, FILTER_VIEWER_REVIEW_REQUESTED, AGENT_ASSIGNMENT, FILTER_AGENT_TASK_STATE, FILTER_AGENT_TASKS_SORT, AGENT_TASK_CCA, AGENT_TASK_CLI, AGENT_TASK_CLI_REPOLESS, AGENT_TASK_VSCODE, REPOSITORY_CREATION, UNKNOWN__};
    }

    static {
        MobileSubjectType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
        Companion = new l();
    }

    private MobileSubjectType(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static MobileSubjectType valueOf(String str) {
        return (MobileSubjectType) Enum.valueOf(MobileSubjectType.class, str);
    }

    public static MobileSubjectType[] values() {
        return (MobileSubjectType[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    public static Object ordinal(Object... a) {
        return null;
    }
}
