package com.testcase;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class WatchListController {
	
private NegativeWatchList negativeWatchList;

	public void sendNegativeWatchList() {
		List<NegativeWatchList> negativeWatchList = getNegativeWatchList(CommonConstants.page,
				CommonConstants.pageSize);
		if (!CollectionUtils.isEmpty(negativeWatchList)) {
			do {
				List<String> employerList = processNegativeWatchList(negativeWatchList);
				sendNegWatchListToRosette(employerList, negativeWatchList);

				negativeWatchList = getNegativeWatchList(CommonConstants.page, CommonConstants.pageSize);
			} while (!negativeWatchList.isEmpty());
}
