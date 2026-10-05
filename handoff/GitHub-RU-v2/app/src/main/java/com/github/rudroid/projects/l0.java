package com.github.rudroid.projects;

import android.app.Application;
import ic.vh;
import java.time.ZonedDateTime;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes.dex */
public final class l0 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: r, reason: collision with root package name */
        public static final a f17736r;

        /* renamed from: s, reason: collision with root package name */
        public static final a f17737s;

        /* renamed from: t, reason: collision with root package name */
        public static final a f17738t;

        /* renamed from: u, reason: collision with root package name */
        public static final /* synthetic */ a[] f17739u;

        static {
            a aVar = new a("Owner", 0);
            f17736r = aVar;
            a aVar2 = new a("Repository", 1);
            f17737s = aVar2;
            a aVar3 = new a("User", 2);
            f17738t = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            f17739u = aVarArr;
            v8.l0.t(aVarArr);
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f17739u.clone();
        }
    }

    public static ArrayList a(Application application, ArrayList arrayList, a aVar) {
        Application application2 = application;
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(x61.n.F(arrayList2, 10));
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            l01.w0 w0Var = (l01.w0) obj;
            String str = w0Var.r;
            ZonedDateTime zonedDateTime = w0Var.u;
            boolean z10 = aVar == a.f17738t;
            String str2 = w0Var.z;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            String str4 = w0Var.A;
            if (str4 == null) {
                str4 = "";
            }
            int i10 = w0Var.s;
            String str5 = w0Var.t;
            if (str5 != null) {
                str3 = str5;
            }
            arrayList3.add(new r1(str, z10, str2, str4, i10, str3, vh.j(application2, zonedDateTime, true, true), vh.j(application2, zonedDateTime, true, false), w0Var.v, w0Var.w, w0Var.x, w0Var.y));
            application2 = application;
            arrayList2 = arrayList;
        }
        return arrayList3;
    }
}
