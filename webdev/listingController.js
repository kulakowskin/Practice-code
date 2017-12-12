angular.module('listings').controller('ListingsController', ['$scope', 'Listings',
  function($scope, Listings) {
    $scope.listings = Listings;
    $scope.detailedInfo = undefined;

    /*
      Implement these functions in the controller to make your application function
      as described in the assignment spec.
     */
    $scope.addListing = function() {
          //var list = JSON.parse(Listings);
          var name, code, lat, long, addr;
          name = document.getElementById("nameInput").value;
          code = document.getElementById("codeInput").value.toUpperCase();
          lat = document.getElementById("latInput").value;
          long = document.getElementById("longInput").value;
          addr = document.getElementById("addressInput").value;

          document.getElementById("nameInput").value = '';
          document.getElementById("codeInput").value = '';
          document.getElementById("latInput").value = '';
          document.getElementById("longInput").value = '';
          document.getElementById("addressInput").value = '';

          $scope.listings.push({"code":code,"name":name, "coordinates":{"latitude":lat, "longitude":long}, "address":addr});
          //$scope.listings = JSON.stringify(list);
    };

    $scope.deleteListing = function(index) {
          $scope.listings.splice(index, 1);
    };

    $scope.showDetails = function(index) {
          var details = $scope.listings[index];
          var detailedInfo = '';
            detailedInfo += 'Code: ' + details.code;
            detailedInfo += '\nName: ' + details.name;
            detailedInfo += '\nCoordinates: \n\tLatitude: ' + details.coordinates.latitude + '\n\tLongitude: ' + details.coordinates.longitude;
            detailedInfo += '\nAddress: ' + details.address;
            $scope.detailedInfo = detailedInfo;
   };

   $scope.filterSearch = function(){

        var input, filter, table, tr, td, i;
        input = document.getElementById("searchInput");
        filter = input.value.toUpperCase();
        table = document.getElementById("myTable");
        tr = table.getElementsByTagName("tr");

        for (i = 0; i < tr.length; i++) {
          td0 = tr[i].getElementsByTagName("td")[0];
          td1 = tr[i].getElementsByTagName("td")[1];
          if (td0) {
            if ((td0.innerHTML.toUpperCase().indexOf(filter) > -1) || (td1.innerHTML.toUpperCase().indexOf(filter) > -1)) {
              tr[i].style.display = "";
            } else {
              tr[i].style.display = "none";
            }
          }
        }

  };
  }
]);
