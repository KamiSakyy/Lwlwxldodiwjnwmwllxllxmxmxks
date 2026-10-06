package c81;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes5.dex */
public class b {
    public static final b r;
    public static final b s;
    public static final b t;
    public static final b u;
    public static final b v;
    public static final /* synthetic */ b[] w;

    static {
        b bVar = new b("CPU_ACQUIRED", 0);
        r = bVar;
        b bVar2 = new b("BLOCKING", 1);
        s = bVar2;
        b bVar3 = new b("PARKING", 2);
        t = bVar3;
        b bVar4 = new b("DORMANT", 3);
        u = bVar4;
        b bVar5 = new b("TERMINATED", 4);
        v = bVar5;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
        w = bVarArr;
        l0.t(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) w.clone();
    }
    public Object ordinal() { return null; }
}
