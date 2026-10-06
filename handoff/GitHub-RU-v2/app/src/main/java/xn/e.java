package xn;

import com.github.service.copilot.AgentTaskStatus$Companion;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public final class eShadow {
    public static final AgentTaskStatus$Companion Companion;
    public static final Object r;
    public static final eShadow s;
    public static final eShadow t;
    public static final eShadow u;
    public static final /* synthetic */ eShadow[] v;

    static {
        eShadow eVar = new eShadow("COMPLETED", 0);
        s = eVar;
        eShadow eVar2 = new eShadow("IN_PROGRESS", 1);
        eShadow eVar3 = new eShadow("QUEUED", 2);
        eShadow eVar4 = new eShadow("FAILED", 3);
        eShadow eVar5 = new eShadow("WAITING_FOR_USER", 4);
        eShadow eVar6 = new eShadow("TIMED_OUT", 5);
        eShadow eVar7 = new eShadow("CANCELLED", 6);
        t = eVar7;
        eShadow eVar8 = new eShadow("UNKNOWN", 7);
        u = eVar8;
        eShadow[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8};
        v = eVarArr;
        v8.l0.t(eVarArr);
        Companion = new AgentTaskStatus$Companion();
        r = sy.w.s(w61.i.r, new wm.a(13));
    }

    public static e valueOf(String str) {
        return (eShadow) Enum.valueOf(eShadow.class, str);
    }

    public static eShadow[] values() {
        return (eShadow[]) v.clone();
    }
}
