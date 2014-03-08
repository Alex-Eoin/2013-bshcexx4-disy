package kamarad;


/**
* kamarad/OnlineKamaradHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from kamarad.idl
* Wednesday, March 5, 2014 10:00:42 AM GMT
*/

abstract public class OnlineKamaradHelper
{
  private static String  _id = "IDL:kamarad/OnlineKamarad:1.0";

  public static void insert (org.omg.CORBA.Any a, kamarad.OnlineKamarad that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static kamarad.OnlineKamarad extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (kamarad.OnlineKamaradHelper.id (), "OnlineKamarad");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static kamarad.OnlineKamarad read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_OnlineKamaradStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, kamarad.OnlineKamarad value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static kamarad.OnlineKamarad narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof kamarad.OnlineKamarad)
      return (kamarad.OnlineKamarad)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      kamarad._OnlineKamaradStub stub = new kamarad._OnlineKamaradStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static kamarad.OnlineKamarad unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof kamarad.OnlineKamarad)
      return (kamarad.OnlineKamarad)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      kamarad._OnlineKamaradStub stub = new kamarad._OnlineKamaradStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
