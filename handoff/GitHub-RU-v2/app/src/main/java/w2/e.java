package w2;

/* loaded from: /home/user/work/p/classes.dex */
public class e extends k.w {

    /* renamed from: c, reason: collision with root package name */
    public static e f33004c;

    @Override // k.w
    public final int[] m(int i) {
        int length = q().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < length && q().charAt(i) == '\n' && (q().charAt(i) == '\n' || (i != 0 && q().charAt(i - 1) != '\n'))) {
            i++;
        }
        if (i >= length) {
            return null;
        }
        int i10 = i + 1;
        while (i10 < length && !u(i10)) {
            i10++;
        }
        return p(i, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        return null;
     */
    @Override // k.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] s(int i) {
        int length = q().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && q().charAt(i - 1) == '\n' && !u(i)) {
            i--;
        }
        int i10 = i - 1;
        while (i10 > 0 && (q().charAt(i10) == '\n' || (i10 != 0 && q().charAt(i10 - 1) != '\n'))) {
            i10--;
        }
        return p(i10, i);
    }

    public final boolean u(int i) {
        if (i <= 0 || q().charAt(i - 1) == '\n') {
            return false;
        }
        return i == q().length() || q().charAt(i) == '\n';
    }
}
