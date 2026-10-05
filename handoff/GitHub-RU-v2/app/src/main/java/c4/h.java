package c4;

/* loaded from: /home/user/work/p/classes.dex */
public final class h extends c {
    public static h j(String str) {
        h hVar = new h(str.toCharArray());
        hVar.f4106s = 0L;
        hVar.i(str.length() - 1);
        return hVar;
    }

    @Override // c4.c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof h) && b().equals(((h) obj).b())) {
            return true;
        }
        return super.equals(obj);
    }
}
