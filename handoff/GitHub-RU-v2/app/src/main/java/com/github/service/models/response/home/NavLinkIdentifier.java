package com.github.service.models.response.home;

import d71.a;
import g01.e;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class NavLinkIdentifier {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ NavLinkIdentifier[] $VALUES;
    public static final e Companion;
    public static final NavLinkIdentifier DISCUSSIONS = new NavLinkIdentifier("DISCUSSIONS", 0, "DISCUSSIONS");
    public static final NavLinkIdentifier ISSUES = new NavLinkIdentifier("ISSUES", 1, "ISSUES");
    public static final NavLinkIdentifier ORGANIZATIONS = new NavLinkIdentifier("ORGANIZATIONS", 2, "ORGANIZATIONS");
    public static final NavLinkIdentifier PROJECTS = new NavLinkIdentifier("PROJECTS", 3, "PROJECTS");
    public static final NavLinkIdentifier PULL_REQUESTS = new NavLinkIdentifier("PULL_REQUESTS", 4, "PULL_REQUESTS");
    public static final NavLinkIdentifier REPOSITORIES = new NavLinkIdentifier("REPOSITORIES", 5, "REPOSITORIES");
    public static final NavLinkIdentifier STARRED = new NavLinkIdentifier("STARRED", 6, "STARRED");
    public static final NavLinkIdentifier UNKNOWN__ = new NavLinkIdentifier("UNKNOWN__", 7, "UNKNOWN__");
    private String rawValue;

    private static final /* synthetic */ NavLinkIdentifier[] $values() {
        return new NavLinkIdentifier[]{DISCUSSIONS, ISSUES, ORGANIZATIONS, PROJECTS, PULL_REQUESTS, REPOSITORIES, STARRED, UNKNOWN__};
    }

    static {
        NavLinkIdentifier[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
        Companion = new e();
    }

    private NavLinkIdentifier(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static NavLinkIdentifier valueOf(String str) {
        return (NavLinkIdentifier) Enum.valueOf(NavLinkIdentifier.class, str);
    }

    public static NavLinkIdentifier[] values() {
        return (NavLinkIdentifier[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    public static Object ordinal(Object... a) {
        return null;
    }

    public static Object name(Object... a) {
        return null;
    }
}
