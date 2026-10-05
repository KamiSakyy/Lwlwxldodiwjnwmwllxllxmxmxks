package com.github.rudroid.copilot.threads;

import v8.l0;

/* loaded from: /home/user/work/p/classes.dex */
public final class l {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: r, reason: collision with root package name */
        public static final a f10034r;

        /* renamed from: s, reason: collision with root package name */
        public static final a f10035s;

        /* renamed from: t, reason: collision with root package name */
        public static final a f10036t;

        /* renamed from: u, reason: collision with root package name */
        public static final a f10037u;

        /* renamed from: v, reason: collision with root package name */
        public static final a f10038v;

        /* renamed from: w, reason: collision with root package name */
        public static final /* synthetic */ a[] f10039w;

        static {
            a aVar = new a("TODAY", 0);
            f10034r = aVar;
            a aVar2 = new a("YESTERDAY", 1);
            f10035s = aVar2;
            a aVar3 = new a("WEEKLY", 2);
            f10036t = aVar3;
            a aVar4 = new a("MONTHLY", 3);
            f10037u = aVar4;
            a aVar5 = new a("OLDER", 4);
            f10038v = aVar5;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
            f10039w = aVarArr;
            l0.t(aVarArr);
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f10039w.clone();
        }
    }
}
