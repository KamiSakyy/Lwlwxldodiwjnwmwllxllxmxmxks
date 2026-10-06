package com.github.rudroid.achievements.ui;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* loaded from: /home/user/work/p/classes.dex */
public final class l implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    public w61.p f4532a;

    /* renamed from: b, reason: collision with root package name */
    public float[] f4533b;

    /* renamed from: c, reason: collision with root package name */
    public float[] f4534c;

    /* renamed from: d, reason: collision with root package name */
    public x71.hShadow f4535d;

    public l(Context context) {
        k71.k.g(context, "context");
        this.f4532a = sy.w.t(new k(0, context));
        this.f4535d = t.e.a(0, 7, null);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr;
        Sensor sensor;
        Sensor sensor2;
        if (sensorEvent != null && (sensor2 = sensorEvent.sensor) != null && sensor2.getType() == 9) {
            this.f4533b = sensorEvent.values;
        }
        if (sensorEvent != null && (sensor = sensorEvent.sensor) != null && sensor.getType() == 2) {
            this.f4534c = sensorEvent.values;
        }
        float[] fArr2 = this.f4533b;
        if (fArr2 == null || (fArr = this.f4534c) == null) {
            return;
        }
        float[] fArr3 = new float[9];
        if (SensorManager.getRotationMatrix(fArr3, new float[9], fArr2, fArr)) {
            float[] fArr4 = new float[3];
            SensorManager.getOrientation(fArr3, fArr4);
            this.f4535d.j(new j(fArr4[2], fArr4[1]));
        }
    }
}
