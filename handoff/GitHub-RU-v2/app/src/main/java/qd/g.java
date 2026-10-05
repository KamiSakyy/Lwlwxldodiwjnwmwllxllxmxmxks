package qd;

import e6.w;
import java.io.File;
import w61.a0;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class g implements j71.a {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f31031r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j71.a f31032s;

    public /* synthetic */ g(int i, j71.a aVar) {
        this.f31031r = i;
        this.f31032s = aVar;
    }

    public final Object a() {
        switch (this.f31031r) {
            case k5.f.J:
                this.f31032s.a();
                return Boolean.TRUE;
            case 1:
                this.f31032s.a();
                return Boolean.TRUE;
            case 2:
                this.f31032s.a();
                return Boolean.TRUE;
            case 3:
                this.f31032s.a();
                return Boolean.TRUE;
            case 4:
                File file = (File) this.f31032s.a();
                k71.k.g(file, "<this>");
                String name = file.getName();
                k71.k.f(name, "getName(...)");
                if (t71.p.m0('.', name, "").equals("preferences_pb")) {
                    File absoluteFile = file.getAbsoluteFile();
                    k71.k.f(absoluteFile, "getAbsoluteFile(...)");
                    return absoluteFile;
                }
                throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
            case 5:
                this.f31032s.a();
                return a0.a;
            case 6:
                this.f31032s.a();
                return a0.a;
            case 7:
                this.f31032s.a();
                return Boolean.TRUE;
            case 8:
                this.f31032s.a();
                return Boolean.TRUE;
            case 9:
                this.f31032s.a();
                return a0.a;
            case 10:
                this.f31032s.a();
                return Boolean.TRUE;
            case w.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                this.f31032s.a();
                return Boolean.TRUE;
            case w.HAS_IMAGE_ALPHA_FIELD_NUMBER /* 12 */:
                this.f31032s.a();
                return a0.a;
            case 13:
                this.f31032s.a();
                return a0.a;
            case 14:
                this.f31032s.a();
                return a0.a;
            case androidx.compose.foundation.layout.b.f1079h /* 15 */:
                this.f31032s.a();
                return a0.a;
            case 16:
                this.f31032s.a();
                return a0.a;
            case 17:
                this.f31032s.a();
                return a0.a;
            case 18:
                this.f31032s.a();
                return a0.a;
            case 19:
                this.f31032s.a();
                return a0.a;
            case 20:
                this.f31032s.a();
                return a0.a;
            case 21:
                this.f31032s.a();
                return a0.a;
            case 22:
                this.f31032s.a();
                return a0.a;
            case 23:
                this.f31032s.a();
                return a0.a;
            default:
                this.f31032s.a();
                return a0.a;
        }
    }
}
