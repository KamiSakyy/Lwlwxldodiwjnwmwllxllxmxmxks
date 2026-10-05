package androidx.lifecycle;

import kotlin.NoWhenBranchMatchedException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class v {
    private static final /* synthetic */ d71.a $ENTRIES;
    private static final /* synthetic */ v[] $VALUES;
    public static final t Companion;
    public static final v ON_ANY;
    public static final v ON_CREATE;
    public static final v ON_DESTROY;
    public static final v ON_PAUSE;
    public static final v ON_RESUME;
    public static final v ON_START;
    public static final v ON_STOP;

    static {
        v vVar = new v("ON_CREATE", 0);
        ON_CREATE = vVar;
        v vVar2 = new v("ON_START", 1);
        ON_START = vVar2;
        v vVar3 = new v("ON_RESUME", 2);
        ON_RESUME = vVar3;
        v vVar4 = new v("ON_PAUSE", 3);
        ON_PAUSE = vVar4;
        v vVar5 = new v("ON_STOP", 4);
        ON_STOP = vVar5;
        v vVar6 = new v("ON_DESTROY", 5);
        ON_DESTROY = vVar6;
        v vVar7 = new v("ON_ANY", 6);
        ON_ANY = vVar7;
        v[] vVarArr = {vVar, vVar2, vVar3, vVar4, vVar5, vVar6, vVar7};
        $VALUES = vVarArr;
        $ENTRIES = v8.l0.t(vVarArr);
        Companion = new t();
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) $VALUES.clone();
    }

    public final w a() {
        switch (u.f2925a[ordinal()]) {
            case 1:
            case 2:
                return w.f2941t;
            case 3:
            case 4:
                return w.f2942u;
            case 5:
                return w.f2943v;
            case 6:
                return w.f2939r;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
