package com.oneops.transistor.domain;

import java.util.ArrayList;
import java.util.List;

import com.oneops.cms.dj.domain.CmsRfcCI;
import com.oneops.cms.dj.domain.CmsRfcRelation;

public class ManifestRfcContainer {
	
	//CmsRfcCI rootRfc;
	CmsRfcCI manifestPlatformRfc;
	ManifestRootRfcContainer rootRfcRelTouple = new ManifestRootRfcContainer();
	List<CmsRfcCI> rfcList = new ArrayList<CmsRfcCI>();;
	List<CmsRfcRelation> rfcRelationList = new ArrayList<CmsRfcRelation>();
	List<Long> deleteCiIdList = new ArrayList<Long>();
	List<CmsRfcRelation> rfcDeleteRelationList = new ArrayList<CmsRfcRelation>();
	List<ManifestRootRfcContainer> rfcRelToupleList = new ArrayList<ManifestRootRfcContainer>();
	List<ManifestRfcRelationTriplet> rfcRelTripletList = new ArrayList<>();

	public ManifestRootRfcContainer getRootRfcRelTouple() {
		return rootRfcRelTouple;
	}

	public void setRootRfcRelTouple(ManifestRootRfcContainer rootRfcRelTouple) {
		this.rootRfcRelTouple = rootRfcRelTouple;
	}

	public CmsRfcCI getManifestPlatformRfc() {
		return manifestPlatformRfc;
	}

	public void setManifestPlatformRfc(CmsRfcCI manifestPlatformRfc) {
		this.manifestPlatformRfc = manifestPlatformRfc;
	}

	public List<CmsRfcCI> getRfcList() {
		return rfcList;
	}

	public void setRfcList(List<CmsRfcCI> rfcList) {
		this.rfcList = rfcList;
	}

	public List<CmsRfcRelation> getRfcRelationList() {
		return rfcRelationList;
	}

	public void setRfcRelationList(List<CmsRfcRelation> rfcRelationList) {
		this.rfcRelationList = rfcRelationList;
	}

	public List<CmsRfcRelation> getRfcDeleteRelationList() {
		return rfcDeleteRelationList;
	}

	public void setRfcDeleteRelationList(List<CmsRfcRelation> rfcDeleteRelationList) {
		this.rfcDeleteRelationList = rfcDeleteRelationList;
	}

	public List<Long> getDeleteCiIdList() {
		return deleteCiIdList;
	}

	public void setDeleteCiIdList(List<Long> deleteCiIdList) {
		this.deleteCiIdList = deleteCiIdList;
	}

	public List<ManifestRootRfcContainer> getRfcRelToupleList() {
		return rfcRelToupleList;
	}

	public void setRfcRelToupleList(List<ManifestRootRfcContainer> rfcRelToupleList) {
		this.rfcRelToupleList = rfcRelToupleList;
	}

	public List<ManifestRfcRelationTriplet> getRfcRelTripletList() {
		return rfcRelTripletList;
	}

	public void setRfcRelTripletList(List<ManifestRfcRelationTriplet> rfcRelTripletList) {
		this.rfcRelTripletList = rfcRelTripletList;
	}
	
}
