package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class rr {
    public static final /* synthetic */ rr[] A;
    public static final /* synthetic */ d71.b B;
    public static final qr Companion;
    public static final rr s;
    public static final rr t;
    public static final rr u;
    public static final rr v;
    public static final rr w;
    public static final rr x;
    public static final rr y;
    public static final rr z;
    public String r;

    static {
        rr rrVar = new rr("ARCHIVED", 0, "ARCHIVED");
        s = rrVar;
        rr rrVar2 = new rr("FORK", 1, "FORK");
        t = rrVar2;
        rr rrVar3 = new rr("MIRROR", 2, "MIRROR");
        u = rrVar3;
        rr rrVar4 = new rr("PRIVATE", 3, "PRIVATE");
        v = rrVar4;
        rr rrVar5 = new rr("PUBLIC", 4, "PUBLIC");
        w = rrVar5;
        rr rrVar6 = new rr("SOURCE", 5, "SOURCE");
        x = rrVar6;
        rr rrVar7 = new rr("SPONSORABLE", 6, "SPONSORABLE");
        rr rrVar8 = new rr("TEMPLATE", 7, "TEMPLATE");
        y = rrVar8;
        rr rrVar9 = new rr("UNKNOWN__", 8, "UNKNOWN__");
        z = rrVar9;
        rr[] rrVarArr = {rrVar, rrVar2, rrVar3, rrVar4, rrVar5, rrVar6, rrVar7, rrVar8, rrVar9};
        A = rrVarArr;
        B = v8.l0.t(rrVarArr);
        Companion = new qr();
        sy.d0Shadow.o(new String[]{"ARCHIVED", "FORK", "MIRROR", "PRIVATE", "PUBLIC", "SOURCE", "SPONSORABLE", "TEMPLATE"});
    }

    public rr(String str, int i, String str2) {
        this.r = str2;
    }

    public static rr valueOf(String str) {
        return (rr) Enum.valueOf(rr.class, str);
    }

    public static rr[] values() {
        return (rr[]) A.clone();
    }
}
