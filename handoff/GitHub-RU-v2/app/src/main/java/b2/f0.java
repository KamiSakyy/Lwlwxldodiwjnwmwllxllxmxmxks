package b2;

import kotlin.NoWhenBranchMatchedException;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class f0 implements e0 {

    /* renamed from: r, reason: collision with root package name */
    public static final f0 f3326r;

    /* renamed from: s, reason: collision with root package name */
    public static final f0 f3327s;

    /* renamed from: t, reason: collision with root package name */
    public static final f0 f3328t;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ f0[] f3329u;

    static {
        f0 f0Var = new f0("Active", 0);
        f3326r = f0Var;
        f0 f0Var2 = new f0("ActiveParent", 1);
        f3327s = f0Var2;
        f0 f0Var3 = new f0("Captured", 2);
        f0 f0Var4 = new f0("Inactive", 3);
        f3328t = f0Var4;
        f0[] f0VarArr = {f0Var, f0Var2, f0Var3, f0Var4};
        f3329u = f0VarArr;
        l0.t(f0VarArr);
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) f3329u.clone();
    }

    public final boolean a() {
        int ordinal = ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            return true;
        }
        if (ordinal == 3) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean b() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return false;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return false;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return true;
    }
}
