package v01;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class c {
    public static final c A;
    public static final /* synthetic */ c[] B;
    public static final c t;
    public static final c u;
    public static final c v;
    public static final c w;
    public static final c x;
    public static final c y;
    public static final c z;
    public final b r;
    public final a s;

    static {
        b bVar = b.t;
        a aVar = a.s;
        c cVar = new c("MostRecentContribution", 0, bVar, aVar);
        t = cVar;
        a aVar2 = a.r;
        c cVar2 = new c("LeastRecentContribution", 1, bVar, aVar2);
        u = cVar2;
        b bVar2 = b.r;
        c cVar3 = new c("Newest", 2, bVar2, aVar);
        v = cVar3;
        c cVar4 = new c("Oldest", 3, bVar2, aVar2);
        w = cVar4;
        b bVar3 = b.s;
        c cVar5 = new c("NameAscending", 4, bVar3, aVar2);
        x = cVar5;
        c cVar6 = new c("NameDescending", 5, bVar3, aVar);
        y = cVar6;
        b bVar4 = b.u;
        c cVar7 = new c("MostStars", 6, bVar4, aVar);
        z = cVar7;
        c cVar8 = new c("LeastStars", 7, bVar4, aVar2);
        A = cVar8;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8};
        B = cVarArr;
        l0.t(cVarArr);
    }

    public c(String str, int i, b bVar, a aVar) {
        this.r = bVar;
        this.s = aVar;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) B.clone();
    }
}
