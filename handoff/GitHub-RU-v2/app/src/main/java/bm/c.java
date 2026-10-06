package bm;

import java.util.List;
import sy.d0Shadow;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public static final c s;
    public static final c t;
    public static final c u;
    public static final /* synthetic */ c[] v;
    public List r;

    static {
        c cVar = new c(0, "ISSUE", x61.l.r(new String[]{"is:issue", "type:issue"}));
        s = cVar;
        c cVar2 = new c(1, "PULL_REQUEST", x61.l.r(new String[]{"is:pr", "type:pr"}));
        t = cVar2;
        c cVar3 = new c(2, "DISCUSSION", d0.n("category"));
        u = cVar3;
        c[] cVarArr = {cVar, cVar2, cVar3};
        v = cVarArr;
        l0.t(cVarArr);
    }

    public c(int i, String str, List list) {
        this.r = list;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) v.clone();
    }
}
