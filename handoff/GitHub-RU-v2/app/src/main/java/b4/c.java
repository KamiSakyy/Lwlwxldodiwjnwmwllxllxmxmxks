package b4;

/* loaded from: /home/user/work/p/classes.dex */
public final class c extends com.google.common.util.concurrent.a {

    /* renamed from: a, reason: collision with root package name */
    public double f3404a;

    /* renamed from: b, reason: collision with root package name */
    public double[] f3405b;

    public final void A(double d10, double[] dArr) {
        for (int i = 0; i < this.f3405b.length; i++) {
            dArr[i] = 0.0d;
        }
    }

    public final double[] B() {
        return new double[]{this.f3404a};
    }

    public final double x(double d10) {
        return this.f3405b[0];
    }

    public final void y(double d10, double[] dArr) {
        double[] dArr2 = this.f3405b;
        System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
    }

    public final void z(double d10, float[] fArr) {
        int i = 0;
        while (true) {
            double[] dArr = this.f3405b;
            if (i >= dArr.length) {
                return;
            }
            fArr[i] = (float) dArr[i];
            i++;
        }
    }
}
