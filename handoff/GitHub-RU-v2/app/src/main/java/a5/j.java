package a5;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import java.util.Map;
import java.util.Objects;

/* loaded from: /home/user/work/p/classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public Context f422a;

    /* renamed from: b, reason: collision with root package name */
    public k f423b;

    /* renamed from: c, reason: collision with root package name */
    public VelocityTracker f424c;

    /* renamed from: d, reason: collision with root package name */
    public float f425d;

    /* renamed from: e, reason: collision with root package name */
    public int f426e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f427f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f428g = -1;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f429h = {Integer.MAX_VALUE, 0};

    public j(Context context, k kVar) {
        this.f422a = context;
        this.f423b = kVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x00b8, code lost:
    
        if (r5 >= 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0071, code lost:
    
        if (r14 >= 0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0234  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(MotionEvent motionEvent, int i) {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        float f6;
        float f10;
        long j10;
        float f11;
        float sqrt;
        float f12;
        float f13;
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        int i14 = this.f427f;
        int[] iArr = this.f429h;
        if (i14 == source && this.f428g == deviceId && this.f426e == i) {
            z10 = false;
            i10 = 1;
            i11 = 0;
        } else {
            Context context = this.f422a;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int deviceId2 = motionEvent.getDeviceId();
            int source2 = motionEvent.getSource();
            i10 = 1;
            int i15 = Build.VERSION.SDK_INT;
            i11 = 0;
            if (i15 >= 34) {
                i12 = k0.h(viewConfiguration, deviceId2, i, source2);
            } else {
                InputDevice device = InputDevice.getDevice(deviceId2);
                if (device != null && device.getMotionRange(i, source2) != null) {
                    Resources resources = context.getResources();
                    int identifier = (source2 == 4194304 && i == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier == -1) {
                        i12 = viewConfiguration.getScaledMinimumFlingVelocity();
                    } else if (identifier != 0) {
                        i12 = resources.getDimensionPixelSize(identifier);
                    }
                }
                i12 = Integer.MAX_VALUE;
            }
            iArr[0] = i12;
            int deviceId3 = motionEvent.getDeviceId();
            int source3 = motionEvent.getSource();
            if (i15 >= 34) {
                i13 = k0.g(viewConfiguration, deviceId3, i, source3);
            } else {
                InputDevice device2 = InputDevice.getDevice(deviceId3);
                if (device2 != null && device2.getMotionRange(i, source3) != null) {
                    Resources resources2 = context.getResources();
                    int identifier2 = (source3 == 4194304 && i == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier2 == -1) {
                        i13 = viewConfiguration.getScaledMaximumFlingVelocity();
                    } else if (identifier2 != 0) {
                        i13 = resources2.getDimensionPixelSize(identifier2);
                    }
                }
                i13 = Integer.MIN_VALUE;
            }
            iArr[1] = i13;
            this.f427f = source;
            this.f428g = deviceId;
            this.f426e = i;
            z10 = true;
        }
        if (iArr[i11] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f424c;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f424c = null;
                return;
            }
            return;
        }
        if (this.f424c == null) {
            this.f424c = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker2 = this.f424c;
        Map map = l0.f438a;
        velocityTracker2.addMovement(motionEvent);
        float f14 = 0.0f;
        int i16 = 20;
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            Map map2 = l0.f438a;
            if (!map2.containsKey(velocityTracker2)) {
                map2.put(velocityTracker2, new m0());
            }
            m0 m0Var = (m0) map2.get(velocityTracker2);
            long[] jArr = m0Var.f442b;
            long eventTime = motionEvent.getEventTime();
            if (m0Var.f444d != 0 && eventTime - jArr[m0Var.f445e] > 40) {
                m0Var.f444d = i11;
                m0Var.f443c = 0.0f;
            }
            int i17 = (m0Var.f445e + 1) % 20;
            m0Var.f445e = i17;
            int i18 = m0Var.f444d;
            if (i18 != 20) {
                m0Var.f444d = i18 + 1;
            }
            m0Var.f441a[i17] = motionEvent.getAxisValue(26);
            jArr[m0Var.f445e] = eventTime;
        }
        velocityTracker2.computeCurrentVelocity(1000, Float.MAX_VALUE);
        m0 m0Var2 = (m0) l0.f438a.get(velocityTracker2);
        if (m0Var2 != null) {
            float[] fArr = m0Var2.f441a;
            long[] jArr2 = m0Var2.f442b;
            int i19 = m0Var2.f444d;
            if (i19 >= 2) {
                int i20 = m0Var2.f445e;
                int i21 = ((i20 + 20) - (i19 - 1)) % 20;
                long j11 = jArr2[i20];
                while (true) {
                    j10 = jArr2[i21];
                    if (j11 - j10 <= 100) {
                        break;
                    }
                    m0Var2.f444d--;
                    i21 = (i21 + 1) % 20;
                }
                int i22 = m0Var2.f444d;
                if (i22 >= 2) {
                    if (i22 == 2) {
                        int i23 = (i21 + 1) % 20;
                        if (j10 != jArr2[i23]) {
                            sqrt = fArr[i23] / (r13 - j10);
                            f11 = Float.MAX_VALUE;
                            f6 = 0.0f;
                        }
                    } else {
                        f11 = Float.MAX_VALUE;
                        float f15 = 0.0f;
                        int i24 = 0;
                        int i25 = 0;
                        while (true) {
                            if (i24 >= m0Var2.f444d - 1) {
                                break;
                            }
                            int i26 = i24 + i21;
                            long j12 = jArr2[i26 % 20];
                            int i27 = (i26 + 1) % i16;
                            if (jArr2[i27] == j12) {
                                f12 = f14;
                            } else {
                                i25++;
                                f12 = f14;
                                float sqrt2 = (f15 < f14 ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f15) * 2.0f));
                                float f16 = fArr[i27] / (jArr2[i27] - j12);
                                f15 += Math.abs(f16) * (f16 - sqrt2);
                                if (i25 == i10) {
                                    f15 *= 0.5f;
                                }
                            }
                            i24++;
                            f14 = f12;
                            i16 = 20;
                            i10 = 1;
                        }
                        f6 = f14;
                        sqrt = (f15 < f6 ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f15) * 2.0f));
                    }
                    f13 = sqrt * 1000;
                    m0Var2.f443c = f13;
                    if (f13 >= (-Math.abs(f11))) {
                        m0Var2.f443c = -Math.abs(f11);
                    } else if (m0Var2.f443c > Math.abs(f11)) {
                        m0Var2.f443c = Math.abs(f11);
                    }
                }
            }
            f11 = Float.MAX_VALUE;
            sqrt = 0.0f;
            f6 = 0.0f;
            f13 = sqrt * 1000;
            m0Var2.f443c = f13;
            if (f13 >= (-Math.abs(f11))) {
            }
        } else {
            f6 = 0.0f;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            f10 = k0.d(velocityTracker2, i);
        } else if (i == 0) {
            f10 = velocityTracker2.getXVelocity();
        } else if (i == 1) {
            f10 = velocityTracker2.getYVelocity();
        } else {
            m0 m0Var3 = (m0) l0.f438a.get(velocityTracker2);
            f10 = (m0Var3 == null || i != 26) ? f6 : m0Var3.f443c;
        }
        k kVar = this.f423b;
        float e5 = kVar.e() * f10;
        float signum = Math.signum(e5);
        if (z10 || (signum != Math.signum(this.f425d) && signum != f6)) {
            kVar.i();
        }
        if (Math.abs(e5) < iArr[0]) {
            return;
        }
        float max = Math.max(-r1, Math.min(e5, iArr[1]));
        this.f425d = kVar.b(max) ? max : f6;
    }
}
