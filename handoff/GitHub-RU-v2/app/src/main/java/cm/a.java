package cm;

import d71.b;
import java.util.List;
import on.c;
import sy.d0;
import v8.l0;
import x61.r;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public static final a A;
    public static final /* synthetic */ a[] B;
    public static final /* synthetic */ b C;
    public static final a s;
    public static final a t;
    public static final a u;
    public static final a v;
    public static final a w;
    public static final a x;
    public static final a y;
    public static final a z;
    public List r;

    static {
        a aVar = new a(0, "ALL", r.r);
        s = aVar;
        a aVar2 = new a(1, "CANCELLED", d0.n(c.r));
        t = aVar2;
        a aVar3 = new a(2, "COMPLETED", d0.n(c.s));
        u = aVar3;
        a aVar4 = new a(3, "FAILED", d0.n(c.t));
        v = aVar4;
        a aVar5 = new a(4, "IDLE", d0.n(c.u));
        w = aVar5;
        a aVar6 = new a(5, "IN_PROGRESS", d0.n(c.v));
        x = aVar6;
        a aVar7 = new a(6, "QUEUED", d0.n(c.w));
        y = aVar7;
        a aVar8 = new a(7, "TIMED_OUT", d0.n(c.x));
        z = aVar8;
        a aVar9 = new a(8, "WAITING_FOR_USER", d0.n(c.y));
        A = aVar9;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9};
        B = aVarArr;
        C = l0.t(aVarArr);
    }

    public a(int i, String str, List list) {
        this.r = list;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) B.clone();
    }
}
