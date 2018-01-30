package com.iet.inspec;

import java.io.File;
import java.io.IOException;

import system.ValueType;
import net.sf.jni4net.Bridge;

public class Trevorisation {

	public static void main(String[] args) throws IOException {

		Bridge.setVerbose(true);
		Bridge.init();

		Bridge.LoadAndRegisterAssemblyFrom(new File(
				"Inspec.Ideas.Trevorisation.j4n.dll"));
		Person personDetails = personSplit();

	}

	private static Person personSplit() {
		ValueType result = inspec.ideas.trevorisation.PersonSplit
				.SplitPerson("Neha middle1 middle2 Nagpal NickName Ms. Suffix false Email@gmail.com StdFormat");
		Person personDetails = new Person();
		personDetails.setRawData(result.GetType().GetField("RawData")
				.GetValue(result).ToString());
		personDetails.setFirstName(result.GetType().GetField("FirstName")
				.GetValue(result).ToString());
		personDetails.setMiddleName1(result.GetType().GetField("MiddleName1")
				.GetValue(result).ToString());
		personDetails.setMiddleName2(result.GetType().GetField("MiddleName2")
				.GetValue(result).ToString());
		personDetails.setFamilyName(result.GetType().GetField("FamilyName")
				.GetValue(result).ToString());
		personDetails.setNickName(result.GetType().GetField("NickName")
				.GetValue(result).ToString());
		personDetails.setPrefix(result.GetType().GetField("Prefix")
				.GetValue(result).ToString());
		personDetails.setSuffix(result.GetType().GetField("Suffix")
				.GetValue(result).ToString());
		personDetails.setReverseOrder(Boolean.parseBoolean((result.GetType().GetField("ReverseOrder")
				.GetValue(result).toString())));
		personDetails.setEmail(result.GetType().GetField("Email")
				.GetValue(result).ToString());
		personDetails.setStdFormat(result.GetType().GetField("StdFormat")
				.GetValue(result).ToString());

		System.out.println("RawData : "
				+ result.GetType().GetField("RawData").GetValue(result));
		System.out.println("FirstName : "
				+ result.GetType().GetField("FirstName").GetValue(result));
		System.out.println("MiddleName1 : "
				+ result.GetType().GetField("MiddleName1").GetValue(result));
		System.out.println("MiddleName2 : "
				+ result.GetType().GetField("MiddleName2").GetValue(result));
		System.out.println("FamilyName : "
				+ result.GetType().GetField("FamilyName").GetValue(result));
		System.out.println("NickName : "
				+ result.GetType().GetField("NickName").GetValue(result));
		System.out.println("Prefix : "
				+ result.GetType().GetField("Prefix").GetValue(result));
		System.out.println("Suffix : "
				+ result.GetType().GetField("Suffix").GetValue(result));
		System.out.println("ReverseOrder : "
				+ result.GetType().GetField("ReverseOrder").GetValue(result));
		System.out.println("Email : "
				+ result.GetType().GetField("Email").GetValue(result));
		System.out.println("StdFormat : "
				+ result.GetType().GetField("StdFormat").GetValue(result));
		return personDetails;
	}

}
