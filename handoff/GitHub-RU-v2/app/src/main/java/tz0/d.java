package tz0;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class d {
    public static final d A;
    public static final d B;
    public static final d C;
    public static final d D;
    public static final d E;
    public static final d F;
    public static final d G;
    public static final d H;
    public static final d I;
    public static final /* synthetic */ d[] J;
    public static final d r;
    public static final d s;
    public static final d t;
    public static final d u;
    public static final d v;
    public static final d w;
    public static final d x;
    public static final d y;
    public static final d z;

    static {
        d dVar = new d("ACTION_REQUIRED", 0);
        r = dVar;
        d dVar2 = new d("CANCELLED", 1);
        s = dVar2;
        d dVar3 = new d("COMPLETED", 2);
        t = dVar3;
        d dVar4 = new d("ERROR", 3);
        u = dVar4;
        d dVar5 = new d("EXPECTED", 4);
        v = dVar5;
        d dVar6 = new d("FAILURE", 5);
        w = dVar6;
        d dVar7 = new d("IN_PROGRESS", 6);
        x = dVar7;
        d dVar8 = new d("NEUTRAL", 7);
        y = dVar8;
        d dVar9 = new d("PENDING", 8);
        z = dVar9;
        d dVar10 = new d("QUEUED", 9);
        A = dVar10;
        d dVar11 = new d("REQUESTED", 10);
        B = dVar11;
        d dVar12 = new d("SKIPPED", 11);
        C = dVar12;
        d dVar13 = new d("STALE", 12);
        D = dVar13;
        d dVar14 = new d("STARTUP_FAILURE", 13);
        E = dVar14;
        d dVar15 = new d("SUCCESS", 14);
        F = dVar15;
        d dVar16 = new d("TIMED_OUT", 15);
        G = dVar16;
        d dVar17 = new d("WAITING", 16);
        H = dVar17;
        d dVar18 = new d("UNKNOWN__", 17);
        I = dVar18;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10, dVar11, dVar12, dVar13, dVar14, dVar15, dVar16, dVar17, dVar18};
        J = dVarArr;
        l0.t(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) J.clone();
    }
}
