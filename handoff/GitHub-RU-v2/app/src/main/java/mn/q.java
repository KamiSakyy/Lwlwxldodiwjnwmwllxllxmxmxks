package mn;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class q {
    public static final q r;
    public static final /* synthetic */ q[] s;

    static {
        q qVar = new q("BOOLEAN", 0);
        q qVar2 = new q("CHOICE", 1);
        q qVar3 = new q("ENVIRONMENT", 2);
        q qVar4 = new q("NUMBER", 3);
        r = qVar4;
        q[] qVarArr = {qVar, qVar2, qVar3, qVar4, new q("STRING", 4)};
        s = qVarArr;
        l0.t(qVarArr);
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) s.clone();
    }
}
