package d2;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: /home/user/work/p/classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public Path f21346a;

    /* renamed from: b, reason: collision with root package name */
    public RectF f21347b;

    /* renamed from: c, reason: collision with root package name */
    public float[] f21348c;

    /* renamed from: d, reason: collision with root package name */
    public Matrix f21349d;

    public i(Path path) {
        this.f21346a = path;
    }

    public static void a(i iVar, i iVar2) {
        Path path = iVar.f21346a;
        if (!(iVar2 instanceof i)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        path.addPath(iVar2.f21346a, Float.intBitsToFloat((int) 0), Float.intBitsToFloat((int) 0));
    }

    public static void b(i iVar, c2.c cVar) {
        j0[] j0VarArr = j0.f21353r;
        iVar.getClass();
        float f6 = cVar.f4060a;
        float f10 = cVar.f4063d;
        float f11 = cVar.f4062c;
        float f12 = cVar.f4061b;
        if (Float.isNaN(f6) || Float.isNaN(f12) || Float.isNaN(f11) || Float.isNaN(f10)) {
            k.b("Invalid rectangle, make sure no value is NaN");
        }
        if (iVar.f21347b == null) {
            iVar.f21347b = new RectF();
        }
        RectF rectF = iVar.f21347b;
        k71.k.d(rectF);
        rectF.set(f6, f12, f11, f10);
        Path path = iVar.f21346a;
        RectF rectF2 = iVar.f21347b;
        k71.k.d(rectF2);
        path.addRect(rectF2, Path.Direction.CCW);
    }

    public static void c(i iVar, c2.d dVar) {
        j0[] j0VarArr = j0.f21353r;
        if (iVar.f21347b == null) {
            iVar.f21347b = new RectF();
        }
        RectF rectF = iVar.f21347b;
        k71.k.d(rectF);
        float f6 = dVar.f4064a;
        long j10 = dVar.f4071h;
        long j11 = dVar.f4070g;
        long j12 = dVar.f4069f;
        long j13 = dVar.f4068e;
        rectF.set(f6, dVar.f4065b, dVar.f4066c, dVar.f4067d);
        if (iVar.f21348c == null) {
            iVar.f21348c = new float[8];
        }
        float[] fArr = iVar.f21348c;
        k71.k.d(fArr);
        fArr[0] = Float.intBitsToFloat((int) (j13 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j13 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j12 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j12 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j11 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j11 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j10 >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j10 & 4294967295L));
        Path path = iVar.f21346a;
        RectF rectF2 = iVar.f21347b;
        k71.k.d(rectF2);
        float[] fArr2 = iVar.f21348c;
        k71.k.d(fArr2);
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    public final c2.c d() {
        if (this.f21347b == null) {
            this.f21347b = new RectF();
        }
        RectF rectF = this.f21347b;
        k71.k.d(rectF);
        this.f21346a.computeBounds(rectF, true);
        return new c2.c(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void e(float f6, float f10) {
        this.f21346a.lineTo(f6, f10);
    }

    public final boolean f(i iVar, i iVar2, int i) {
        Path.Op op = i == 0 ? Path.Op.DIFFERENCE : i == 1 ? Path.Op.INTERSECT : i == 4 ? Path.Op.REVERSE_DIFFERENCE : i == 2 ? Path.Op.UNION : Path.Op.XOR;
        if (!(iVar instanceof i)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = iVar.f21346a;
        if (iVar2 instanceof i) {
            return this.f21346a.op(path, iVar2.f21346a, op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public final void g() {
        this.f21346a.reset();
    }

    public final void h() {
        this.f21346a.rewind();
    }

    public final void i(int i) {
        this.f21346a.setFillType(i == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    public final void j(long j10) {
        Matrix matrix = this.f21349d;
        if (matrix == null) {
            this.f21349d = new Matrix();
        } else {
            k71.k.d(matrix);
            matrix.reset();
        }
        Matrix matrix2 = this.f21349d;
        k71.k.d(matrix2);
        matrix2.setTranslate(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
        Matrix matrix3 = this.f21349d;
        k71.k.d(matrix3);
        this.f21346a.transform(matrix3);
    }
}
