package dz;

import com.github.service.models.response.TrendingPeriod;
import m10.ac0;
import m10.zb0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract /* synthetic */ class s {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TrendingPeriod.values().length];
        try {
            iArr[TrendingPeriod.DAILY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TrendingPeriod.MONTHLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TrendingPeriod.WEEKLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TrendingPeriod.UNKNOWN__.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[ac0.values().length];
        try {
            zb0 zb0Var = ac0.Companion;
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            zb0 zb0Var2 = ac0.Companion;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            zb0 zb0Var3 = ac0.Companion;
            iArr2[2] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            zb0 zb0Var4 = ac0.Companion;
            iArr2[3] = 4;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
