package y4;

import android.text.SpannableStringBuilder;
import com.google.android.gms.internal.measurement.n4;

/* loaded from: /home/user/work/p/classes.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    public static final String f34257b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f34258c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f34259d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f34260e;

    /* renamed from: a, reason: collision with root package name */
    public boolean f34261a;

    static {
        n4 n4Var = f.f34269c;
        f34257b = Character.toString((char) 8206);
        f34258c = Character.toString((char) 8207);
        f34259d = new b(false);
        f34260e = new b(true);
    }

    public b(boolean z10) {
        n4 n4Var = f.f34267a;
        this.f34261a = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006e, code lost:
    
        if (r1 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0071, code lost:
    
        if (r2 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0073, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0076, code lost:
    
        if (r0.f34255c <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x007c, code lost:
    
        switch(r0.a()) {
            case 14: goto L66;
            case 15: goto L66;
            case 16: goto L65;
            case 17: goto L65;
            case 18: goto L64;
            default: goto L70;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0080, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0083, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0086, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0089, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x008c, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(CharSequence charSequence) {
        byte directionality;
        a aVar = new a(charSequence);
        aVar.f34255c = 0;
        int i = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = aVar.f34255c;
            if (i12 < aVar.f34254b && i == 0) {
                CharSequence charSequence2 = aVar.f34253a;
                char charAt = charSequence2.charAt(i12);
                aVar.f34256d = charAt;
                if (Character.isHighSurrogate(charAt)) {
                    int codePointAt = Character.codePointAt(charSequence2, aVar.f34255c);
                    aVar.f34255c = Character.charCount(codePointAt) + aVar.f34255c;
                    directionality = Character.getDirectionality(codePointAt);
                } else {
                    aVar.f34255c++;
                    char c10 = aVar.f34256d;
                    directionality = c10 < 1792 ? a.f34252e[c10] : Character.getDirectionality(c10);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i11 == 0) {
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case androidx.compose.foundation.layout.b.f1079h /* 15 */:
                                i11++;
                                i10 = -1;
                                continue;
                            case 16:
                            case 17:
                                i11++;
                                i10 = 1;
                                continue;
                            case 18:
                                i11--;
                                i10 = 0;
                                continue;
                        }
                    }
                } else if (i11 == 0) {
                }
                i = i11;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0034, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(CharSequence charSequence) {
        a aVar = new a(charSequence);
        aVar.f34255c = aVar.f34254b;
        int i = 0;
        while (true) {
            int i10 = i;
            while (aVar.f34255c > 0) {
                byte a10 = aVar.a();
                if (a10 != 0) {
                    if (a10 == 1 || a10 == 2) {
                        if (i != 0) {
                            if (i10 == 0) {
                                break;
                            }
                        }
                    } else if (a10 != 9) {
                        switch (a10) {
                            case 14:
                            case androidx.compose.foundation.layout.b.f1079h /* 15 */:
                                if (i10 == i) {
                                    return -1;
                                }
                                i--;
                                break;
                            case 16:
                            case 17:
                                if (i10 == i) {
                                    break;
                                }
                                i--;
                                break;
                            case 18:
                                i++;
                                break;
                            default:
                                if (i10 != 0) {
                                    break;
                                } else {
                                    break;
                                }
                                break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    if (i == 0) {
                        return -1;
                    }
                    if (i10 == 0) {
                        break;
                    }
                }
            }
            return 0;
        }
    }

    public final SpannableStringBuilder c(CharSequence charSequence) {
        n4 n4Var = f.f34269c;
        if (charSequence == null) {
            return null;
        }
        boolean e5 = n4Var.e(charSequence.length(), charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean e10 = (e5 ? f.f34268b : f.f34267a).e(charSequence.length(), charSequence);
        String str = "";
        String str2 = f34258c;
        String str3 = f34257b;
        boolean z10 = this.f34261a;
        spannableStringBuilder.append((CharSequence) ((z10 || !(e10 || a(charSequence) == 1)) ? (!z10 || (e10 && a(charSequence) != -1)) ? "" : str2 : str3));
        if (e5 != z10) {
            spannableStringBuilder.append(e5 ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean e11 = (e5 ? f.f34268b : f.f34267a).e(charSequence.length(), charSequence);
        if (!z10 && (e11 || b(charSequence) == 1)) {
            str = str3;
        } else if (z10 && (!e11 || b(charSequence) == -1)) {
            str = str2;
        }
        spannableStringBuilder.append((CharSequence) str);
        return spannableStringBuilder;
    }

    public static Object b;
    public static final Object f1079h = null;
}
