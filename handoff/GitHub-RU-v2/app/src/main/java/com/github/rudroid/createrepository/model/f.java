package com.github.rudroid.createrepository.model;

import java.util.Locale;
import k71.k;
import t71.n;
import t71.o;
import t71.w;

/* loaded from: /home/user/work/p/classes.dex */
public final class f {
    public static final a Companion = new a();

    /* renamed from: a, reason: collision with root package name */
    public static final n f10594a = new n("[^a-zA-Z0-9_.\\-]+");

    /* renamed from: b, reason: collision with root package name */
    public static final n f10595b = new n("(\\.git)+$", o.f32142s);

    /* renamed from: c, reason: collision with root package name */
    public static final n f10596c = new n("[\\p{Cntrl}]");

    public static final class a {
    }

    public static String a(String str) {
        k.g(str, "name");
        String g7 = f10595b.g(f10594a.g(str, "-"), "");
        if (!w.x(g7, ".github.com", true)) {
            return g7;
        }
        String lowerCase = g7.toLowerCase(Locale.ROOT);
        k.f(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
