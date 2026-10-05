package com.github.rudroid.common;

import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class f {
    public static final /* synthetic */ f[] A;
    public static final a Companion;

    /* renamed from: r, reason: collision with root package name */
    public static final f f9289r;

    /* renamed from: s, reason: collision with root package name */
    public static final List f9290s;

    /* renamed from: t, reason: collision with root package name */
    public static final f f9291t;

    /* renamed from: u, reason: collision with root package name */
    public static final f f9292u;

    /* renamed from: v, reason: collision with root package name */
    public static final f f9293v;

    /* renamed from: w, reason: collision with root package name */
    public static final f f9294w;

    /* renamed from: x, reason: collision with root package name */
    public static final f f9295x;

    /* renamed from: y, reason: collision with root package name */
    public static final f f9296y;

    /* renamed from: z, reason: collision with root package name */
    public static final f f9297z;

    public static final class a {
        public static f a(int i) {
            switch (i) {
                case 1:
                    return f.f9291t;
                case 2:
                    return f.f9292u;
                case 3:
                    return f.f9293v;
                case 4:
                    return f.f9294w;
                case 5:
                    return f.f9295x;
                case 6:
                    return f.f9296y;
                case 7:
                    return f.f9297z;
                default:
                    throw new IllegalStateException((i + " is not a valid DaysOfWeek").toString());
            }
        }
    }

    static {
        f fVar = new f("Sunday", 0);
        f9291t = fVar;
        f fVar2 = new f("Monday", 1);
        f9292u = fVar2;
        f fVar3 = new f("Tuesday", 2);
        f9293v = fVar3;
        f fVar4 = new f("Wednesday", 3);
        f9294w = fVar4;
        f fVar5 = new f("Thursday", 4);
        f9295x = fVar5;
        f fVar6 = new f("Friday", 5);
        f9296y = fVar6;
        f fVar7 = new f("Saturday", 6);
        f9297z = fVar7;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7};
        A = fVarArr;
        v8.l0.t(fVarArr);
        Companion = new a();
        f9289r = fVar;
        f9290s = x61.l.r(new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7});
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) A.clone();
    }

    public f(Object... a) {
    }
}
