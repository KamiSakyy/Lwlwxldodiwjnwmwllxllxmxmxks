package androidx.glance.appwidget.protobuf;

/* loaded from: /home/user/work/p/classes.dex */
class Utf8$UnpairedSurrogateException extends IllegalArgumentException {
    public Utf8$UnpairedSurrogateException(int i, int i10) {
        super(no.a.j(i, i10, "Unpaired surrogate at index ", " of "));
    }
}
