package i7;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public final class b extends d {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(Context context, int i) {
        super(r1);
        switch (i) {
            case 1:
                k.g(context, "context");
                Object systemService = context.getSystemService((Class<Object>) MeasurementManager.class);
                k.f(systemService, "context.getSystemService…ementManager::class.java)");
                super((MeasurementManager) systemService);
                break;
            default:
                k.g(context, "context");
                MeasurementManager measurementManager = MeasurementManager.get(context);
                k.f(measurementManager, "get(context)");
                break;
        }
    }
}
