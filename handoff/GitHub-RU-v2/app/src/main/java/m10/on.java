package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class on {
    public static final nn Companion;
    public static final on s;
    public static final /* synthetic */ on[] t;
    public static final /* synthetic */ d71.b u;
    public String r;

    static {
        on onVar = new on("GESTURE", 0, "GESTURE");
        on onVar2 = new on("KEY_COMMAND", 1, "KEY_COMMAND");
        on onVar3 = new on("LEFT_SWIPE", 2, "LEFT_SWIPE");
        on onVar4 = new on("LONG_PRESS", 3, "LONG_PRESS");
        on onVar5 = new on("PRESS", 4, "PRESS");
        on onVar6 = new on("RIGHT_SWIPE", 5, "RIGHT_SWIPE");
        on onVar7 = new on("SWIPE", 6, "SWIPE");
        on onVar8 = new on("UNKNOWN__", 7, "UNKNOWN__");
        s = onVar8;
        on[] onVarArr = {onVar, onVar2, onVar3, onVar4, onVar5, onVar6, onVar7, onVar8};
        t = onVarArr;
        u = v8.l0.t(onVarArr);
        Companion = new nn();
        sy.d0Shadow.o("GESTURE", "KEY_COMMAND", "LEFT_SWIPE", "LONG_PRESS", "PRESS", "RIGHT_SWIPE", "SWIPE");
    }

    public on(String str, int i, String str2) {
        this.r = str2;
    }

    public static on valueOf(String str) {
        return (on) Enum.valueOf(on.class, str);
    }

    public static on[] values() {
        return (on[]) t.clone();
    }
}
