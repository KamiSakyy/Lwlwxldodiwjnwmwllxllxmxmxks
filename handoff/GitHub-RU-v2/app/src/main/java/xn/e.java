package xn;

import com.github.service.copilot.AgentTaskStatus$Companion;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public final class e {
    public static final AgentTaskStatus$Companion Companion;
    public static final Object r;
    public static final e s;
    public static final e t;
    public static final e u;
    public static final /* synthetic */ e[] v;

    static {
        e eVar = new e("COMPLETED", 0);
        s = eVar;
        e eVar2 = new e("IN_PROGRESS", 1);
        e eVar3 = new e("QUEUED", 2);
        e eVar4 = new e("FAILED", 3);
        e eVar5 = new e("WAITING_FOR_USER", 4);
        e eVar6 = new e("TIMED_OUT", 5);
        e eVar7 = new e("CANCELLED", 6);
        t = eVar7;
        e eVar8 = new e("UNKNOWN", 7);
        u = eVar8;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8};
        v = eVarArr;
        v8.l0.t(eVarArr);
        Companion = new AgentTaskStatus$Companion();
        r = sy.w.s(w61.i.r, new wm.a(13));
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) v.clone();
    }
}
