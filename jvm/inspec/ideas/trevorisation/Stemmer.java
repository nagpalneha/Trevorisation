
package inspec.ideas.trevorisation;

@net.sf.jni4net.attributes.ClrType
public class Stemmer extends system.Object {
    
    //<generated-proxy>
    private static system.Type staticType;
    
    protected Stemmer(net.sf.jni4net.inj.INJEnv __env, long __handle) {
            super(__env, __handle);
    }
    
    @net.sf.jni4net.attributes.ClrConstructor("()V")
    public Stemmer() {
            super(((net.sf.jni4net.inj.INJEnv)(null)), 0);
        inspec.ideas.trevorisation.Stemmer.__ctorStemmer0(this);
    }
    
    @net.sf.jni4net.attributes.ClrConstructor("(LInspec/Ideas/Trevorisation/Stemmer+StemmerMode;)V")
    public Stemmer(system.Enum mode) {
            super(((net.sf.jni4net.inj.INJEnv)(null)), 0);
        inspec.ideas.trevorisation.Stemmer.__ctorStemmer1(this, mode);
    }
    
    @net.sf.jni4net.attributes.ClrMethod("()V")
    private native static void __ctorStemmer0(net.sf.jni4net.inj.IClrProxy thiz);
    
    @net.sf.jni4net.attributes.ClrMethod("(Lsystem/Enum;)V")
    private native static void __ctorStemmer1(net.sf.jni4net.inj.IClrProxy thiz, system.Enum mode);
    
    @net.sf.jni4net.attributes.ClrMethod("()LInspec/Ideas/Trevorisation/Stemmer+StemmerMode;")
    public native system.Enum getMode();
    
    @net.sf.jni4net.attributes.ClrMethod("(LInspec/Ideas/Trevorisation/Stemmer+StemmerMode;)V")
    public native void setMode(system.Enum value);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;)LSystem/String;")
    public native java.lang.String GetStem(java.lang.String term);
    
    public static system.Type typeof() {
        return inspec.ideas.trevorisation.Stemmer.staticType;
    }
    
    private static void InitJNI(net.sf.jni4net.inj.INJEnv env, system.Type staticType) {
        inspec.ideas.trevorisation.Stemmer.staticType = staticType;
    }
    //</generated-proxy>
}
