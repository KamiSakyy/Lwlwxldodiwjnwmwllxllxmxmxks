package bm;

import com.github.service.models.response.TrendingPeriod;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract /* synthetic */ class v {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TrendingPeriod.values().length];
        try {
            iArr[TrendingPeriod.WEEKLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TrendingPeriod.MONTHLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TrendingPeriod.DAILY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TrendingPeriod.UNKNOWN__.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
