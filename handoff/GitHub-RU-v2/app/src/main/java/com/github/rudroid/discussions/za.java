package com.github.rudroid.discussions;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class za implements zh.b {
    public static final a Companion = new a();

    /* renamed from: r, reason: collision with root package name */
    public int f12052r;

    /* renamed from: s, reason: collision with root package name */
    public String f12053s;

    public static final class a {
    }

    public za(String str, int i) {
        k71.k.g(str, "stableId");
        this.f12052r = i;
        this.f12053s = str;
    }

    public final String E() {
        return this.f12053s;
    }

    public final int h() {
        return this.f12052r;
    }
}
