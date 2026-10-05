package bm;

import android.content.Context;
import com.github.service.models.response.TrendingPeriod;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class w {
    public static final String a(TrendingPeriod trendingPeriod, Context context) {
        k71.k.g(trendingPeriod, "<this>");
        int i = v.a[trendingPeriod.ordinal()];
        if (i == 1) {
            String string = context.getString(2131954324);
            k71.k.f(string, "getString(...)");
            return string;
        }
        if (i == 2) {
            String string2 = context.getString(2131954323);
            k71.k.f(string2, "getString(...)");
            return string2;
        }
        if (i != 3 && i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        String string3 = context.getString(2131954322);
        k71.k.f(string3, "getString(...)");
        return string3;
    }
}
