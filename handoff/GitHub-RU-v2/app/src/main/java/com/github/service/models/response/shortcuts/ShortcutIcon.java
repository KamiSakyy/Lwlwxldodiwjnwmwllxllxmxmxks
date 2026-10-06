package com.github.service.models.response.shortcuts;

import java.util.Set;
import q01.n;
import v8.l0;
import x61.l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class ShortcutIcon {
    private static final /* synthetic */ d71.a $ENTRIES;
    private static final /* synthetic */ ShortcutIcon[] $VALUES;
    public static final ShortcutIcon ARCHIVE;
    public static final n Companion;
    public static final ShortcutIcon GEAR;
    public static final ShortcutIcon HOME;
    public static final ShortcutIcon LINK;
    public static final ShortcutIcon REPO;
    public static final ShortcutIcon REPO_FORKED;
    public static final ShortcutIcon REPO_LOCKED;
    public static final ShortcutIcon REPO_TEMPLATE;
    public static final ShortcutIcon STAR;
    private static final Set<ShortcutIcon> repoEntries;
    private final String value;
    public static final ShortcutIcon ZAP = new ShortcutIcon("ZAP", 0, "ZAP");
    public static final ShortcutIcon ISSUEOPENED = new ShortcutIcon("ISSUEOPENED", 1, "ISSUEOPENED");
    public static final ShortcutIcon GITPULLREQUEST = new ShortcutIcon("GITPULLREQUEST", 2, "GITPULLREQUEST");
    public static final ShortcutIcon COMMENTDISCUSSION = new ShortcutIcon("COMMENTDISCUSSION", 3, "COMMENTDISCUSSION");
    public static final ShortcutIcon ORGANIZATION = new ShortcutIcon("ORGANIZATION", 4, "ORGANIZATION");
    public static final ShortcutIcon PEOPLE = new ShortcutIcon("PEOPLE", 5, "PEOPLE");
    public static final ShortcutIcon BRIEFCASE = new ShortcutIcon("BRIEFCASE", 6, "BRIEFCASE");
    public static final ShortcutIcon FILEDIFF = new ShortcutIcon("FILEDIFF", 7, "FILEDIFF");
    public static final ShortcutIcon CODEREVIEW = new ShortcutIcon("CODEREVIEW", 8, "CODEREVIEW");
    public static final ShortcutIcon CODESCAN = new ShortcutIcon("CODESCAN", 9, "CODESCAN");
    public static final ShortcutIcon COMMENT = new ShortcutIcon("COMMENT", 10, "COMMENT");
    public static final ShortcutIcon COPILOT = new ShortcutIcon("COPILOT", 11, "COPILOT");
    public static final ShortcutIcon TERMINAL = new ShortcutIcon("TERMINAL", 12, "TERMINAL");
    public static final ShortcutIcon TOOLS = new ShortcutIcon("TOOLS", 13, "TOOLS");
    public static final ShortcutIcon BEAKER = new ShortcutIcon("BEAKER", 14, "BEAKER");
    public static final ShortcutIcon ALERT = new ShortcutIcon("ALERT", 15, "ALERT");
    public static final ShortcutIcon EYE = new ShortcutIcon("EYE", 16, "EYE");
    public static final ShortcutIcon TELESCOPE = new ShortcutIcon("TELESCOPE", 17, "TELESCOPE");
    public static final ShortcutIcon BOOKMARK = new ShortcutIcon("BOOKMARK", 18, "BOOKMARK");
    public static final ShortcutIcon CALENDAR = new ShortcutIcon("CALENDAR", 19, "CALENDAR");
    public static final ShortcutIcon METER = new ShortcutIcon("METER", 20, "METER");
    public static final ShortcutIcon MOON = new ShortcutIcon("MOON", 21, "MOON");
    public static final ShortcutIcon SUN = new ShortcutIcon("SUN", 22, "SUN");
    public static final ShortcutIcon FLAME = new ShortcutIcon("FLAME", 23, "FLAME");
    public static final ShortcutIcon GLOBE = new ShortcutIcon("GLOBE", 24, "GLOBE");
    public static final ShortcutIcon BUG = new ShortcutIcon("BUG", 25, "BUG");
    public static final ShortcutIcon NORTHSTAR = new ShortcutIcon("NORTHSTAR", 26, "NORTHSTAR");
    public static final ShortcutIcon ROCKET = new ShortcutIcon("ROCKET", 27, "ROCKET");
    public static final ShortcutIcon SQUIRREL = new ShortcutIcon("SQUIRREL", 28, "SQUIRREL");
    public static final ShortcutIcon HUBOT = new ShortcutIcon("HUBOT", 29, "HUBOT");
    public static final ShortcutIcon DEPENDABOT = new ShortcutIcon("DEPENDABOT", 30, "DEPENDABOT");
    public static final ShortcutIcon CLOCK = new ShortcutIcon("CLOCK", 31, "CLOCK");
    public static final ShortcutIcon MENTION = new ShortcutIcon("MENTION", 32, "MENTION");
    public static final ShortcutIcon SMILEY = new ShortcutIcon("SMILEY", 33, "SMILEY");
    public static final ShortcutIcon PERSON = new ShortcutIcon("PERSON", 34, "PERSON");
    public static final ShortcutIcon INBOX = new ShortcutIcon("INBOX", 35, "INBOX");

    private static final /* synthetic */ ShortcutIcon[] $values() {
        return new ShortcutIcon[]{ZAP, ISSUEOPENED, GITPULLREQUEST, COMMENTDISCUSSION, ORGANIZATION, PEOPLE, BRIEFCASE, FILEDIFF, CODEREVIEW, CODESCAN, COMMENT, COPILOT, TERMINAL, TOOLS, BEAKER, ALERT, EYE, TELESCOPE, BOOKMARK, CALENDAR, METER, MOON, SUN, FLAME, GLOBE, BUG, NORTHSTAR, ROCKET, SQUIRREL, HUBOT, DEPENDABOT, CLOCK, MENTION, SMILEY, PERSON, INBOX, ARCHIVE, GEAR, HOME, LINK, REPO, REPO_FORKED, REPO_LOCKED, REPO_TEMPLATE, STAR};
    }

    static {
        ShortcutIcon shortcutIcon = new ShortcutIcon("ARCHIVE", 36, "ARCHIVE");
        ARCHIVE = shortcutIcon;
        ShortcutIcon shortcutIcon2 = new ShortcutIcon("GEAR", 37, "GEAR");
        GEAR = shortcutIcon2;
        ShortcutIcon shortcutIcon3 = new ShortcutIcon("HOME", 38, "HOME");
        HOME = shortcutIcon3;
        ShortcutIcon shortcutIcon4 = new ShortcutIcon("LINK", 39, "LINK");
        LINK = shortcutIcon4;
        ShortcutIcon shortcutIcon5 = new ShortcutIcon("REPO", 40, "REPO");
        REPO = shortcutIcon5;
        ShortcutIcon shortcutIcon6 = new ShortcutIcon("REPO_FORKED", 41, "REPO_FORKED");
        REPO_FORKED = shortcutIcon6;
        ShortcutIcon shortcutIcon7 = new ShortcutIcon("REPO_LOCKED", 42, "REPO_LOCKED");
        REPO_LOCKED = shortcutIcon7;
        ShortcutIcon shortcutIcon8 = new ShortcutIcon("REPO_TEMPLATE", 43, "REPO_TEMPLATE");
        REPO_TEMPLATE = shortcutIcon8;
        ShortcutIcon shortcutIcon9 = new ShortcutIcon("STAR", 44, "STAR");
        STAR = shortcutIcon9;
        ShortcutIcon[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
        Companion = new n();
        repoEntries = l.j0(new ShortcutIcon[]{shortcutIcon, shortcutIcon2, shortcutIcon3, shortcutIcon4, shortcutIcon5, shortcutIcon6, shortcutIcon7, shortcutIcon8, shortcutIcon9});
    }

    private ShortcutIcon(String str, int i, String str2) {
        this.value = str2;
    }

    public static d71.a getEntries() {
        return $ENTRIES;
    }

    public static ShortcutIcon valueOf(String str) {
        return (ShortcutIcon) Enum.valueOf(ShortcutIcon.class, str);
    }

    public static ShortcutIcon[] values() {
        return (ShortcutIcon[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public <T0> T0 ordinal(Object... a) {
        return null;
    }

    public <T0> T0 name(Object... a) {
        return null;
    }
}
