package com.github.service.models.response;

import v8.l0;
import yz0.r8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class WorkflowRunEvent {
    private static final /* synthetic */ d71.a $ENTRIES;
    private static final /* synthetic */ WorkflowRunEvent[] $VALUES;
    public static final r8 Companion;
    private final String rawValue;
    public static final WorkflowRunEvent BRANCH_PROTECTION_RULE = new WorkflowRunEvent("BRANCH_PROTECTION_RULE", 0, "BRANCH_PROTECTION_RULE");
    public static final WorkflowRunEvent CHECK_RUN = new WorkflowRunEvent("CHECK_RUN", 1, "CHECK_RUN");
    public static final WorkflowRunEvent CHECK_SUITE = new WorkflowRunEvent("CHECK_SUITE", 2, "CHECK_SUITE");
    public static final WorkflowRunEvent CREATE = new WorkflowRunEvent("CREATE", 3, "CREATE");
    public static final WorkflowRunEvent DELETE = new WorkflowRunEvent("DELETE", 4, "DELETE");
    public static final WorkflowRunEvent DEPLOYMENT = new WorkflowRunEvent("DEPLOYMENT", 5, "DEPLOYMENT");
    public static final WorkflowRunEvent DEPLOYMENT_STATUS = new WorkflowRunEvent("DEPLOYMENT_STATUS", 6, "DEPLOYMENT_STATUS");
    public static final WorkflowRunEvent DISCUSSION = new WorkflowRunEvent("DISCUSSION", 7, "DISCUSSION");
    public static final WorkflowRunEvent DISCUSSION_COMMENT = new WorkflowRunEvent("DISCUSSION_COMMENT", 8, "DISCUSSION_COMMENT");
    public static final WorkflowRunEvent DYNAMIC = new WorkflowRunEvent("DYNAMIC", 9, "DYNAMIC");
    public static final WorkflowRunEvent FORK = new WorkflowRunEvent("FORK", 10, "FORK");
    public static final WorkflowRunEvent GOLLUM = new WorkflowRunEvent("GOLLUM", 11, "GOLLUM");
    public static final WorkflowRunEvent ISSUES = new WorkflowRunEvent("ISSUES", 12, "ISSUES");
    public static final WorkflowRunEvent ISSUE_COMMENT = new WorkflowRunEvent("ISSUE_COMMENT", 13, "ISSUE_COMMENT");
    public static final WorkflowRunEvent LABEL = new WorkflowRunEvent("LABEL", 14, "LABEL");
    public static final WorkflowRunEvent MERGE_GROUP = new WorkflowRunEvent("MERGE_GROUP", 15, "MERGE_GROUP");
    public static final WorkflowRunEvent MILESTONE = new WorkflowRunEvent("MILESTONE", 16, "MILESTONE");
    public static final WorkflowRunEvent PAGE_BUILD = new WorkflowRunEvent("PAGE_BUILD", 17, "PAGE_BUILD");
    public static final WorkflowRunEvent PROJECT = new WorkflowRunEvent("PROJECT", 18, "PROJECT");
    public static final WorkflowRunEvent PROJECT_CARD = new WorkflowRunEvent("PROJECT_CARD", 19, "PROJECT_CARD");
    public static final WorkflowRunEvent PROJECT_COLUMN = new WorkflowRunEvent("PROJECT_COLUMN", 20, "PROJECT_COLUMN");
    public static final WorkflowRunEvent PUBLIC = new WorkflowRunEvent("PUBLIC", 21, "PUBLIC");
    public static final WorkflowRunEvent PULL_REQUEST = new WorkflowRunEvent("PULL_REQUEST", 22, "PULL_REQUEST");
    public static final WorkflowRunEvent PULL_REQUEST_REVIEW = new WorkflowRunEvent("PULL_REQUEST_REVIEW", 23, "PULL_REQUEST_REVIEW");
    public static final WorkflowRunEvent PULL_REQUEST_REVIEW_COMMENT = new WorkflowRunEvent("PULL_REQUEST_REVIEW_COMMENT", 24, "PULL_REQUEST_REVIEW_COMMENT");
    public static final WorkflowRunEvent PULL_REQUEST_TARGET = new WorkflowRunEvent("PULL_REQUEST_TARGET", 25, "PULL_REQUEST_TARGET");
    public static final WorkflowRunEvent PUSH = new WorkflowRunEvent("PUSH", 26, "PUSH");
    public static final WorkflowRunEvent REGISTRY_PACKAGE = new WorkflowRunEvent("REGISTRY_PACKAGE", 27, "REGISTRY_PACKAGE");
    public static final WorkflowRunEvent RELEASE = new WorkflowRunEvent("RELEASE", 28, "RELEASE");
    public static final WorkflowRunEvent REPOSITORY_DISPATCH = new WorkflowRunEvent("REPOSITORY_DISPATCH", 29, "REPOSITORY_DISPATCH");
    public static final WorkflowRunEvent SCHEDULE = new WorkflowRunEvent("SCHEDULE", 30, "SCHEDULE");
    public static final WorkflowRunEvent STATUS = new WorkflowRunEvent("STATUS", 31, "STATUS");
    public static final WorkflowRunEvent WATCH = new WorkflowRunEvent("WATCH", 32, "WATCH");
    public static final WorkflowRunEvent WORKFLOW_DISPATCH = new WorkflowRunEvent("WORKFLOW_DISPATCH", 33, "WORKFLOW_DISPATCH");
    public static final WorkflowRunEvent WORKFLOW_RUN = new WorkflowRunEvent("WORKFLOW_RUN", 34, "WORKFLOW_RUN");
    public static final WorkflowRunEvent UNKNOWN__ = new WorkflowRunEvent("UNKNOWN__", 35, "UNKNOWN__");

    private static final /* synthetic */ WorkflowRunEvent[] $values() {
        return new WorkflowRunEvent[]{BRANCH_PROTECTION_RULE, CHECK_RUN, CHECK_SUITE, CREATE, DELETE, DEPLOYMENT, DEPLOYMENT_STATUS, DISCUSSION, DISCUSSION_COMMENT, DYNAMIC, FORK, GOLLUM, ISSUES, ISSUE_COMMENT, LABEL, MERGE_GROUP, MILESTONE, PAGE_BUILD, PROJECT, PROJECT_CARD, PROJECT_COLUMN, PUBLIC, PULL_REQUEST, PULL_REQUEST_REVIEW, PULL_REQUEST_REVIEW_COMMENT, PULL_REQUEST_TARGET, PUSH, REGISTRY_PACKAGE, RELEASE, REPOSITORY_DISPATCH, SCHEDULE, STATUS, WATCH, WORKFLOW_DISPATCH, WORKFLOW_RUN, UNKNOWN__};
    }

    static {
        WorkflowRunEvent[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
        Companion = new r8();
    }

    private WorkflowRunEvent(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static d71.a getEntries() {
        return $ENTRIES;
    }

    public static WorkflowRunEvent valueOf(String str) {
        return (WorkflowRunEvent) Enum.valueOf(WorkflowRunEvent.class, str);
    }

    public static WorkflowRunEvent[] values() {
        return (WorkflowRunEvent[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    public static Object ordinal(Object... a) {
        return null;
    }
}
