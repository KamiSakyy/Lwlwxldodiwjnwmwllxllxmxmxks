package com.github.rudroid.discussions;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class j1 {
    public static final a Companion = new a();

    public static final class a {
    }

    public static final class b extends j1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f11404a;

        /* renamed from: b, reason: collision with root package name */
        public final String f11405b;

        /* renamed from: c, reason: collision with root package name */
        public final String f11406c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f11407d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f11408e;

        /* renamed from: f, reason: collision with root package name */
        public final String f11409f;

        /* renamed from: g, reason: collision with root package name */
        public final String f11410g;

        public b(String str, String str2, String str3, boolean z10, boolean z11, String str4, String str5) {
            k71.k.g(str, "categoryId");
            k71.k.g(str2, "name");
            k71.k.g(str3, "emojiHTML");
            k71.k.g(str4, "description");
            this.f11404a = str;
            this.f11405b = str2;
            this.f11406c = str3;
            this.f11407d = z10;
            this.f11408e = z11;
            this.f11409f = str4;
            this.f11410g = str5;
        }
    }
}
