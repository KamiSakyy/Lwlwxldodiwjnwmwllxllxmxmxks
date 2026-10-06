package com.github.rudroid.pushnotifications;

import a5.g1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class g0 {
    public static final /* synthetic */ d71.b A;
    public static final a Companion;

    /* renamed from: s, reason: collision with root package name */
    public static final g0 f18596s;

    /* renamed from: t, reason: collision with root package name */
    public static final g0 f18597t;

    /* renamed from: u, reason: collision with root package name */
    public static final g0 f18598u;

    /* renamed from: v, reason: collision with root package name */
    public static final g0 f18599v;

    /* renamed from: w, reason: collision with root package name */
    public static final g0 f18600w;

    /* renamed from: x, reason: collision with root package name */
    public static final g0 f18601x;

    /* renamed from: y, reason: collision with root package name */
    public static final g0 f18602y;

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ g0[] f18603z;

    /* renamed from: r, reason: collision with root package name */
    public String f18604r;

    public static final class a {
        public static g0 a(String str) {
            Object obj;
            d71.b bVar = g0.A;
            bVar.getClass();
            g1 g1Var = new g1(8, bVar);
            while (true) {
                if (!g1Var.hasNext()) {
                    obj = null;
                    break;
                }
                obj = g1Var.next();
                if (((g0) obj).f18604r.equals(str)) {
                    break;
                }
            }
            g0 g0Var = (g0) obj;
            return g0Var == null ? g0.f18602y : g0Var;
        }
    }

    static {
        g0 g0Var = new g0("Mention", 0, "mention");
        f18596s = g0Var;
        g0 g0Var2 = new g0("Assigned", 1, "assigned");
        f18597t = g0Var2;
        g0 g0Var3 = new g0("ReviewRequested", 2, "review_requested");
        f18598u = g0Var3;
        g0 g0Var4 = new g0("DeploymentApproval", 3, "approval_requested");
        f18599v = g0Var4;
        g0 g0Var5 = new g0("PullRequestReviewed", 4, "review");
        g0 g0Var6 = new g0("MobileDeviceAuth", 5, "mobile_device_auth");
        f18600w = g0Var6;
        g0 g0Var7 = new g0("CiActivity", 6, "ci_activity");
        g0 g0Var8 = new g0("Release", 7, "release");
        g0 g0Var9 = new g0("LiveUpdateAgents", 8, "live_activity_copilot_coding_agent");
        f18601x = g0Var9;
        g0 g0Var10 = new g0("Unknown", 9, "unknown");
        f18602y = g0Var10;
        g0[] g0VarArr = {g0Var, g0Var2, g0Var3, g0Var4, g0Var5, g0Var6, g0Var7, g0Var8, g0Var9, g0Var10};
        f18603z = g0VarArr;
        A = v8.l0.t(g0VarArr);
        Companion = new a();
    }

    public g0(String str, int i, String str2) {
        this.f18604r = str2;
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) f18603z.clone();
    }
    public Object ordinal() { return null; }
}
