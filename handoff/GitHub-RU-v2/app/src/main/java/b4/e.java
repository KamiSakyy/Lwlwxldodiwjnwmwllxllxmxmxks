package b4;

import android.view.View;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: /home/user/work/p/classes.dex */
public class e {

    /* renamed from: c, reason: collision with root package name */
    public static final e f3410c = new e(0);

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f3411d = {"standard", "accelerate", "decelerate", "linear"};

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3412a;

    /* renamed from: b, reason: collision with root package name */
    public Serializable f3413b;

    public e(int i) {
        this.f3412a = i;
        switch (i) {
            case 1:
                this.f3413b = new HashMap();
                break;
            default:
                this.f3413b = "identity";
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0152, code lost:
    
        if (r19.equals("linear") == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static e d(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new d(str);
        }
        char c10 = 3;
        if (str.startsWith("spline")) {
            l lVar = new l(0);
            lVar.f3413b = str;
            double[] dArr = new double[str.length() / 2];
            int indexOf = str.indexOf(40) + 1;
            int indexOf2 = str.indexOf(44, indexOf);
            int i = 0;
            while (indexOf2 != -1) {
                dArr[i] = Double.parseDouble(str.substring(indexOf, indexOf2).trim());
                indexOf = indexOf2 + 1;
                indexOf2 = str.indexOf(44, indexOf);
                i++;
            }
            dArr[i] = Double.parseDouble(str.substring(indexOf, str.indexOf(41, indexOf)).trim());
            double[] copyOf = Arrays.copyOf(dArr, i + 1);
            int length = (copyOf.length * 3) - 2;
            int length2 = copyOf.length - 1;
            double d10 = 1.0d / length2;
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
            double[] dArr3 = new double[length];
            for (int i10 = 0; i10 < copyOf.length; i10++) {
                double d11 = copyOf[i10];
                int i11 = i10 + length2;
                dArr2[i11][0] = d11;
                double d12 = i10 * d10;
                dArr3[i11] = d12;
                if (i10 > 0) {
                    int i12 = (length2 * 2) + i10;
                    dArr2[i12][0] = d11 + 1.0d;
                    dArr3[i12] = d12 + 1.0d;
                    int i13 = i10 - 1;
                    dArr2[i13][0] = (d11 - 1.0d) - d10;
                    dArr3[i13] = (d12 - 1.0d) - d10;
                }
            }
            i iVar = new i(dArr3, dArr2);
            System.out.println(" 0 " + iVar.x(0.0d));
            System.out.println(" 1 " + iVar.x(1.0d));
            lVar.f3444e = iVar;
            return lVar;
        }
        if (str.startsWith("Schlick")) {
            j jVar = new j(0);
            jVar.f3413b = str;
            int indexOf3 = str.indexOf(40);
            int indexOf4 = str.indexOf(44, indexOf3);
            jVar.f3434e = Double.parseDouble(str.substring(indexOf3 + 1, indexOf4).trim());
            int i14 = indexOf4 + 1;
            jVar.f3435f = Double.parseDouble(str.substring(i14, str.indexOf(44, i14)).trim());
            return jVar;
        }
        switch (str.hashCode()) {
            case -1354466595:
                if (str.equals("accelerate")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -1263948740:
                if (str.equals("decelerate")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -1197605014:
                if (str.equals("anticipate")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -1102672091:
                break;
            case -749065269:
                if (str.equals("overshoot")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 1312628413:
                if (str.equals("standard")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case k5.f.J:
                return new d("cubic(0.4, 0.05, 0.8, 0.7)");
            case 1:
                return new d("cubic(0.0, 0.0, 0.2, 0.95)");
            case 2:
                return new d("cubic(0.36, 0, 0.66, -0.56)");
            case 3:
                return new d("cubic(1, 1, 0, 0)");
            case 4:
                return new d("cubic(0.34, 1.56, 0.64, 1)");
            case 5:
                return new d("cubic(0.4, 0.0, 0.2, 1)");
            default:
                System.err.println("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(f3411d));
                return f3410c;
        }
    }

    public double a(double d10) {
        return d10;
    }

    public double b(double d10) {
        return 1.0d;
    }

    public float c(View view, String str) {
        HashMap hashMap;
        float[] fArr;
        HashMap hashMap2 = (HashMap) this.f3413b;
        if (hashMap2.containsKey(view) && (hashMap = (HashMap) hashMap2.get(view)) != null && hashMap.containsKey(str) && (fArr = (float[]) hashMap.get(str)) != null && fArr.length > 0) {
            return fArr[0];
        }
        return Float.NaN;
    }

    public String toString() {
        switch (this.f3412a) {
            case k5.f.J:
                return (String) this.f3413b;
            default:
                return super.toString();
        }
    }
}
