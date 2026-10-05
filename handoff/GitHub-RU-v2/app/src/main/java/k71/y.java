package k71;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y {
    public static String a(h hVar) {
        String obj = hVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }
}
