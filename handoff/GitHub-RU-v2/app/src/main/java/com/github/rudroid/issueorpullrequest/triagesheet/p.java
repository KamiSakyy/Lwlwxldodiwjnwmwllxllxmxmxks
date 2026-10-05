package com.github.rudroid.issueorpullrequest.triagesheet;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class p {

    /* renamed from: r, reason: collision with root package name */
    public static final p f16514r;

    /* renamed from: s, reason: collision with root package name */
    public static final p f16515s;

    /* renamed from: t, reason: collision with root package name */
    public static final p f16516t;

    /* renamed from: u, reason: collision with root package name */
    public static final p f16517u;

    /* renamed from: v, reason: collision with root package name */
    public static final p f16518v;

    /* renamed from: w, reason: collision with root package name */
    public static final p f16519w;

    /* renamed from: x, reason: collision with root package name */
    public static final p f16520x;

    /* renamed from: y, reason: collision with root package name */
    public static final p f16521y;

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ p[] f16522z;

    static {
        p pVar = new p("ASSIGNEES", 0);
        f16514r = pVar;
        p pVar2 = new p("LABELS", 1);
        f16515s = pVar2;
        p pVar3 = new p("LEGACY_PROJECTS", 2);
        f16516t = pVar3;
        p pVar4 = new p("PROJECTS", 3);
        f16517u = pVar4;
        p pVar5 = new p("MILESTONES", 4);
        f16518v = pVar5;
        p pVar6 = new p("LINKED_ISSUE_OR_PULL_REQUESTS", 5);
        f16519w = pVar6;
        p pVar7 = new p("ISSUE_TYPE", 6);
        f16520x = pVar7;
        p pVar8 = new p("PARENT_ISSUE", 7);
        f16521y = pVar8;
        p[] pVarArr = {pVar, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7, pVar8};
        f16522z = pVarArr;
        l0.t(pVarArr);
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f16522z.clone();
    }
}
