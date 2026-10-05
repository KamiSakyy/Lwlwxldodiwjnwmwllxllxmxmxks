package jx0;

import com.github.service.models.response.TrendingPeriod;
import pz0.e50;
import pz0.f50;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract /* synthetic */ class r {
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
        int[] iArr2 = new int[f50.values().length];
        try {
            e50 e50Var = f50.Companion;
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            e50 e50Var2 = f50.Companion;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            e50 e50Var3 = f50.Companion;
            iArr2[2] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            e50 e50Var4 = f50.Companion;
            iArr2[3] = 4;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
