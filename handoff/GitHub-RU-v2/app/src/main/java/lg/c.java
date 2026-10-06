package lg;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public static final /* synthetic */ c[] A;
    public static final c r;
    public static final c s;
    public static final c t;
    public static final c u;
    public static final c v;
    public static final c w;
    public static final c x;
    public static final c y;
    public static final c z;

    static {
        c cVar = new c("DEFAULT", 0);
        r = cVar;
        c cVar2 = new c("ELEVATED_DEFAULT", 1);
        s = cVar2;
        c cVar3 = new c("BLUE", 2);
        t = cVar3;
        c cVar4 = new c("GREEN", 3);
        u = cVar4;
        c cVar5 = new c("RED", 4);
        v = cVar5;
        c cVar6 = new c("YELLOW", 5);
        w = cVar6;
        c cVar7 = new c("MERGE_QUEUE_YELLOW", 6);
        x = cVar7;
        c cVar8 = new c("PURPLE", 7);
        y = cVar8;
        c cVar9 = new c("ORANGE", 8);
        z = cVar9;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9};
        A = cVarArr;
        l0.t(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) A.clone();
    }
    public Object ordinal() { return null; }
}
